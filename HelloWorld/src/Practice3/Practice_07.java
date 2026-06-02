package Practice3; 	

import java.io.*;

 public class Practice_07 {											
	  
	  public static void main(String[] args) throws IOException
		{
			System.out.println("中間試験と期末試験の点数をそれぞれ入力してください。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("中間試験の値を入力してください");
	        int num1 = Integer.parseInt(br.readLine());

	        System.out.println("期末試験の値を入力してください");
	        int num2 = Integer.parseInt(br.readLine());
	        
	        int sum = num1 + num2;
	        
            if ((num1 >= 60 && num2 >= 60)
            	||(sum >= 130)
            	||(sum >= 100 && (num1 >= 90 || num2 >= 90))){
	            System.out.println("合格です。");
	            }
	          else {
	            System.out.println("不合格です。");
	          }
	   }
 }