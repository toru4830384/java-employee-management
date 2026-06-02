package Practice3; 	

import java.io.*;

 public class Practice_10 {											
	  
	  public static void main(String[] args) throws IOException
		{
			System.out.println("性別と年齢を入力し生命保険料を算出します。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("初めに性別を入力してください。");
			String gender = br.readLine();

	        System.out.println("次に年齢を入力してください。");
	        int age = Integer.parseInt(br.readLine());
	        
	        int life = 0;
	        
	        if (gender.equals("男")) {
	        	if (age >= 80) {
	        		life = 8000;
	        	}
	        	else if (age >= 50) {
	        		life = 7000;
	        	}
	        	else if (age >= 30) {
	        		life = 5000;
	        	}
	        }
	        else if (gender.equals("女")) {
	        	if (age >= 80) {
	        		life = 7000;
	        	}
	        	else if (age >= 50) {
	        		life = 6000;
	        	}
	        	else if (age >= 30) {
	        		life = 4500;
	        	}
	        }
	        else {
		        System.out.println("性別は男か女で入力してください。");
		        return;
	        }
	        System.out.println("保険料は" + life + "円です。");
		}
 }