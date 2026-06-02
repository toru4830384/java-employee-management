package Practice3; 	

import java.io.*;

 public class Practice_08_if {											
	  
	  public static void main(String[] args) throws IOException
		{
			System.out.println("血液型を入力してください。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			
			if (str.equals("A")) {
			    System.out.println("大吉");
			}
			else if (str.equals("B")) {
				System.out.println("中吉");
			}
			else if (str.equals("O")) {
				System.out.println("吉");
			}
			else if (str.equals("AB")) {
				System.out.println("凶");
			}
			else {
				System.out.println("A,B,O,ABで入力してください。");
			}
	   }
 }