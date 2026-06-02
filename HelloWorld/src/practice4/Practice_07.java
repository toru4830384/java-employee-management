package practice4; 	

import java.io.*;
import java.util.ArrayList;

 public class Practice_07 {											
	  
	  public static void main(String[] args) throws IOException
		{
			System.out.println("年齢を5回入力してください。\n入力されたうち20才以上のみを出力します。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
			ArrayList<Integer> ages = new ArrayList<Integer>();
			
			for (int i=0; i<5; i++) {				
               ages.add(
			    Integer.parseInt(br.readLine())
			    );
			}
			ArrayList<Integer> adults = new ArrayList<Integer>();
			
			for(int age : ages) {
				if(age >= 20) {
					adults.add(age);
				}
			}
			if (adults.size() == 0) {
				System.out.println("20才以上は存在しません。");		
			}
			
			else {
				for(int age : adults) {
					System.out.println(age + "才");		
				}
			}
		}
 }