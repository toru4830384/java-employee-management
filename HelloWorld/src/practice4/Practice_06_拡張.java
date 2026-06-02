package practice4; 	

import java.io.*;

 public class Practice_06_拡張 {											
	  
	  public static void main(String[] args) throws IOException
		{
			System.out.println("名前を5つ入力したあと、全ての名前を表示します。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
			String[] names = new String[5];
			
			for (int i=0; i<5; i++) {				
				names[i] = br.readLine();
			}
			
			System.out.println("入力された5つの名前を表示します。");
			
			for (String name : names) {
				System.out.println(name);
			}
		}
 }