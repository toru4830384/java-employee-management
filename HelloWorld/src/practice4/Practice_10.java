package practice4; 	

 public class Practice_10 {											
	  
	  public static void main(String[] args)
		{
		  
			String[][] sco = {
					{"国語","90"},
					{"算数","84"},
					{"日本史","60"},
					{"生物","58"}
			};
			
			int sum = 0;
			
			for(int i=0; i<sco.length; i++) {
			   System.out.println(sco[i][0] + "、" + 
			                      sco[i][1] + "点");
			   
			   sum += Integer.parseInt(sco[i][1]);
		    }
			System.out.println("合計は" + sum + "です。");
		}
 }