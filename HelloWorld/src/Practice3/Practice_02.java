package Practice3; 	

import java.io.*;

 public class Practice_02 {											
	  
	  public static void main(String[] args) throws IOException
		{
			System.out.println("2つの整数を入力してください。より大きい方の値を表示します。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("1つ目の値を入力してください");
	        int a = Integer.parseInt(br.readLine());

	        System.out.println("2つの値を入力してください");
	        int b = Integer.parseInt(br.readLine());

	        if (a > b) {
	            System.out.println(a);
	        }
	        else if (a < b) {
	        	System.out.println(b);
	        }
	        else {
	        	System.out.println("同じ値です。");
	        }
	    }
	}