package Practice3; 	

import java.io.*;

 public class Practice_08_Switch {											
	  
	  public static void main(String[] args) throws IOException
		{
			System.out.println("血液型を入力してください。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			
			switch(str) {
			case "A":
				System.out.println("大吉");
				break;
			case "B":
				System.out.println("中吉");
				break;
			case "O":
				System.out.println("吉");
				break;
			case "AB":
				System.out.println("凶");
				break;
		    default:
		    	System.out.println("A,B,O,ABで入力してください。");
		    	break;
			}
	   }
 }