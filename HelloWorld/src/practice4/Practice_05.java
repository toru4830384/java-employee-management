package practice4; 	

import java.io.*;

 public class Practice_05 {											
	  
	  public static void main(String[] args) throws IOException
		{
			System.out.println("100を超えるまで整数を入力してください。\n合計値を表示します。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
			int sum = 0;
			
			while (sum <= 100) {				
				String str = br.readLine();
				int num = Integer.parseInt(str);
				sum += num;
			}
			
			System.out.println("合計は" + sum + "です。");
		}
 }