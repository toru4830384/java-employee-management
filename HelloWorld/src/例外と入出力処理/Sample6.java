package 例外と入出力処理;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sample6 {
	public static void main(String[] args) {
		System.out.println("文字列を入力してください。");

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			System.out.println(str + "が入力されました。");
		} catch (IOException e) {
			System.out.println("入出力エラーです。");
		}
	}
}