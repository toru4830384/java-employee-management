package practice4; 	

import java.io.*;

 public class Practice_04 {											
	  
	  public static void main(String[] args) throws IOException
		{
			System.out.println("表示する個数を入力してください。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			int num = Integer.parseInt(str);
			
			for(int i=0; i<num; i++) {
				System.out.print(i % 10);
			}
		}
 }