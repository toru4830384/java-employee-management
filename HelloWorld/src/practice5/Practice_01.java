package practice5;

import java.io.*;

class Calc_1 {
	int sum(int n) {
		return n * n;
	}
}
	
 public class Practice_01 {											
	  
	  public static void main(String[] args) throws IOException
		{
		  System.out.println("整数を入力してください。");
		  
		  BufferedReader br = 
					 new BufferedReader(new InputStreamReader(System.in));
		  
		  int num = Integer.parseInt(br.readLine());
		  
		  Calc_1 calc1 = new Calc_1();
		  
		  int result = calc1.sum(num);
		  
		  System.out.println(num + "の2乗は" + result +"です。");
		}
}