package jp.co.hjn.merryapi;

import org.springframework.boot.SpringApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("jp.co.hjn.merryapi.infrastructure.mapper")
public class MerryApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MerryApiApplication.class, args);
    }

}
