package practice5;

import java.io.*;

class Calc_5 {
	void kuku(int num) {
	     for(int i=1; i<=9; i++) {
			System.out.println(num + "×" + i + "=" + (num * i));
	     }
    }
}
	
 public class Practice_05 {											
	  
	  public static void main(String[] args) throws IOException
		{
		  System.out.println("1~9の整数を入力してください。");
		  
		  BufferedReader br = 
					 new BufferedReader(new InputStreamReader(System.in));
		  
		  int num = Integer.parseInt(br.readLine());
		  
		  Calc_5 calc5 = new Calc_5();
		  
		  calc5.kuku(num);
		}
}