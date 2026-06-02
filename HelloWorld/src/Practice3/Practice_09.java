package Practice3; 	

import java.io.*;

 public class Practice_09 {											
	  
	  public static void main(String[] args) throws IOException
		{
			System.out.println("150円のドリンクがあります。お金を投入してください。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
	        int num = Integer.parseInt(br.readLine());
	        int drink = 150;
	        
            if (num > drink) {
	          int many = num - drink;
	            System.out.println(many + "円のお釣りです。");
            }
	          else if (num == drink) {
	            System.out.println("お釣りは0円です");
	          }
	          else  {
	            int nomany = drink - num;
	              System.out.println("投入金額が" + nomany + "円足りません。");
	          }
	    }
 }