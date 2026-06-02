package practice; 	

import java.io.*;

 public class Practice_10 {											
	  
	  public static void main(String[] args) throws IOException
		{
			System.out.println("整数を２つ入力すると平均値がわかります。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			int sum  = 0;
			sum += Integer.parseInt(str1);
			sum += Integer.parseInt(str2);
						
			System.out.println("平均値は" + ((sum)/2) + "です。");
		}
	}