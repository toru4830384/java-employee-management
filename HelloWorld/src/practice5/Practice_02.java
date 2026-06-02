package practice5;

import java.io.*;

class Calc_2 {
	int num(int a, int b) {
		return (a + b) / 2;
	}
}
	
 public class Practice_02 {											
	  
	  public static void main(String[] args) throws IOException
		{
		  System.out.println("整数を2つ入力してください。");
		  
		  BufferedReader br = 
					 new BufferedReader(new InputStreamReader(System.in));
		  
		  int a = Integer.parseInt(br.readLine());
		  int b = Integer.parseInt(br.readLine());
		  
		  Calc_2 calc2 = new Calc_2();
		  
		  int result = calc2.num(a, b);
		  
		  System.out.println(a + "と" + b + "の平均は" + result + "です。");
		}
}