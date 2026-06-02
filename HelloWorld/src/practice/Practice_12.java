package practice; 	

import java.io.*;

 public class Practice_12 {											
	  
	  public static void main(String[] args) throws IOException 
	    {
			System.out.println("２つの文字列を入力すると２つの文字が結合されます。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			System.out.println(str1 + str2);
		}
    }