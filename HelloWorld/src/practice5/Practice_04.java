package practice5;

import java.io.*;

class Calc_4 {
	void size(int s) {
		for(int i=1; i<=s; i++) {
			 for(int j=1; j<=i; j++) {
				 System.out.print("+");
			 }
			 System.out.println();
		}
	}
}
	
 public class Practice_04 {											
	  
	  public static void main(String[] args) throws IOException
		{
		  System.out.println("サイズを入力してください。");
		  
		  BufferedReader br = 
					 new BufferedReader(new InputStreamReader(System.in));
		  
		  int s = Integer.parseInt(br.readLine());
		  
		  Calc_4 calc4 = new Calc_4();
		  
		  calc4.size(s);
		}
}