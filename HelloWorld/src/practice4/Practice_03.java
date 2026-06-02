package practice4; 	

import java.io.*;

 public class Practice_03 {											
	  
	  public static void main(String[] args) throws IOException
		{
			System.out.println("整数を10回入力してください。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
			int sum = 0;
			
			for(int i=1; i<=10; i++) {
			   String str = br.readLine(); 
			   int num = Integer.parseInt(str);
			   sum += num;
			}
			int ave = sum / 10;
			System.out.println("平均値は" + ave + "です。");
		}
}