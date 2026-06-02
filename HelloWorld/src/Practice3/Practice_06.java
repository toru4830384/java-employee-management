package Practice3; 	

import java.io.*;

 public class Practice_06 {											
	  
	  public static void main(String[] args) throws IOException
		{
			System.out.println("正か負の整数を入力してください。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
	        int num = Integer.parseInt(br.readLine());
	        
            if (num > 0) {
	          if (num % 2 == 0) {
	            System.out.println("正の偶数です。");
	          }
	          else {
	            System.out.println("正の奇数です。");
	          }
            }
	        else if (num < 0) {
	          if (num % 2 == 0) {
	            System.out.println("負の偶数です。");
	          }
	          else {
	            System.out.println("負の奇数です。");
	          }
	        }
	        else {
	        	System.out.println("正でも負でもない偶数です。");
	        }
	   }
 }