package 例外と入出力処理;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Sample7_5 {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test2.txt")));

			pw.println(80);
			pw.println(68);
			pw.println(22);
			pw.println(33);
			pw.println(56);
			pw.println(78);
			pw.println(33);
			pw.println(56);
			System.out.println("ファイルに書き込みました。");

			pw.close();
		} catch (IOException e) {
			System.out.println("入出力エラーです。");
		}
	}
}