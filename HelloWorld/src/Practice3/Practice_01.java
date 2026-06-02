package Practice3; 	

import java.io.*;

 public class Practice_01 {											
	  
	  public static void main(String[] args) throws IOException
		{
			System.out.println("整数を入力してください。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("xの値を入力してください");
	        int X = Integer.parseInt(br.readLine());

	        System.out.println("yの値を入力してください");
	        int Y = Integer.parseInt(br.readLine());

	        if (X > Y) {
	            System.out.println("xはyより大きい");
	        }
	        else if (X < Y) {
	            System.out.println("xはyより小さい");
	        }
	        else {
	            System.out.println("同じ値です。");
	        }
	    }
	}