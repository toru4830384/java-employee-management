package jp.co.hjn.merryapi;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;

import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jp.co.hjn.merryapi.common.enums.EmployeePosition;
import jp.co.hjn.merryapi.common.enums.Sex;
import jp.co.hjn.merryapi.common.enums.SystemRole;

/**
 * アプリケーション設定クラス
 *
 */
@Configuration
public class MerryApiApplicationConfig {

    /**
     * ModelMapper
     *
     * @return ModelMapper
     */
    @Bean
    ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        // EmployeePositionコンバーター追加
        Converter<Integer, EmployeePosition> employeePositionConverter = new AbstractConverter<Integer, EmployeePosition>() {
            @Override
            protected EmployeePosition convert(Integer source) {
                Optional<EmployeePosition> optEmployeePosition = Optional
                        .ofNullable(EmployeePosition.getObject(source));
                return optEmployeePosition.isPresent() ? optEmployeePosition.get() : null;
            }
        };
        modelMapper.addConverter(employeePositionConverter);
        Converter<EmployeePosition, Integer> employeePositionConverter2 = new AbstractConverter<EmployeePosition, Integer>() {
            @Override
            protected Integer convert(EmployeePosition source) {
                return source == null ? null : source.getCode();
            }
        };
        modelMapper.addConverter(employeePositionConverter2);
        // Sexコンバーター追加
        Converter<Integer, Sex> sexConverter = new AbstractConverter<Integer, Sex>() {
            @Override
            protected Sex convert(Integer source) {
                Optional<Sex> optSex = Optional.ofNullable(Sex.getObject(source));
                return optSex.isPresent() ? optSex.get() : null;
            }
        };
        modelMapper.addConverter(sexConverter);
        Converter<Sex, Integer> sexConverter2 = new AbstractConverter<Sex, Integer>() {
            @Override
            protected Integer convert(Sex source) {
                return source == null ? null : source.getCode();
            }
        };
        modelMapper.addConverter(sexConverter2);
        // SystemRoleコンバーター追加
        Converter<Integer, SystemRole> systemRoleConverter = new AbstractConverter<Integer, SystemRole>() {
            @Override
            protected SystemRole convert(Integer source) {
                Optional<SystemRole> optSystemRole = Optional.ofNullable(SystemRole.getObject(source));
                return optSystemRole.isPresent() ? optSystemRole.get() : null;
            }
        };
        modelMapper.addConverter(systemRoleConverter);
        Converter<SystemRole, Integer> systemRoleConverter2 = new AbstractConverter<SystemRole, Integer>() {
            @Override
            protected Integer convert(SystemRole source) {
                return source == null ? null : source.getCode();
            }
        };
        modelMapper.addConverter(systemRoleConverter2);
        // Date-LocaDateコンバーター追加
        Converter<Date, LocalDate> dateToLocalDateConverter = new AbstractConverter<Date, LocalDate>() {
            @Override
            protected LocalDate convert(Date source) {
                Optional<Date> optDate = Optional.ofNullable(source);
                LocalDate localDate = optDate.isPresent()
                        ? LocalDate.ofInstant(optDate.get().toInstant(), ZoneId.systemDefault())
                        : null;
                return localDate;
            }
        };
        modelMapper.addConverter(dateToLocalDateConverter);
        Converter<LocalDate, Date> dateToLocalDateConverter2 = new AbstractConverter<LocalDate, Date>() {
            @Override
            protected Date convert(LocalDate source) {
                Optional<LocalDate> optLocalDate = Optional.ofNullable(source);
                Date date = optLocalDate.isPresent()
                        ? Date.from(optLocalDate.get().atStartOfDay(ZoneId.systemDefault()).toInstant())
                        : null;
                return date;
            }
        };
        modelMapper.addConverter(dateToLocalDateConverter2);

        return modelMapper;
    }
}