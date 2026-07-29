package 例外と入出力処理;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Sample10_5 {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test3.txt")));

			pw.println("A long time ago,");
			pw.println("There was a little girl.");
			System.out.println("ファイルに書き込みました。");

			pw.close();
		} catch (IOException e) {
			System.out.println("入出力エラーです。");
		}
	}
}