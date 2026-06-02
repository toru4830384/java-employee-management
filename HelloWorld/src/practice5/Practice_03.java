package practice5;

import java.io.*;

class Calc_3 {
	int max(int a, int b) {
		if (a > b) {
			return a;
		}
		else {
			return b;
		}
	}
}
	
 public class Practice_03 {											
	  
	  public static void main(String[] args) throws IOException
		{
		  System.out.println("整数を3つ入力してください。");
		  
		  BufferedReader br = 
					 new BufferedReader(new InputStreamReader(System.in));
		  
		  int num1 = Integer.parseInt(br.readLine());
		  int num2 = Integer.parseInt(br.readLine());
		  int num3 = Integer.parseInt(br.readLine());
		  
		  Calc_3 calc3 = new Calc_3();
		  
		  int result1 = calc3.max(num1, num2);
		  int result2 = calc3.max(num3, result1);
		  
		  System.out.println("一番大きい数字は" + result2 + "です。");
		}
}