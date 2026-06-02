package practice4; 	

 public class Practice_09 {											
	  
	  public static void main(String[] args)
		{
		  
			String[][] orders = {
					{"2024/01/01","マウス","3000","2024/01/05"},
					{"2024/01/10","キーボード","4000",""},
					{"2024/01/12","モニター","14000","2024/01/13"}
			};
			
			for(int i=0; i<orders.length; i++) {
				System.out.print("購入日" + orders[i][0] + 
						         "、商品名" + orders[i][1] + 
						         "、金額" + orders[i][2] + "円");
				
				if(orders[i][3].equals("")) {
					System.out.println("、未納");
				}
				
				else {
					System.out.println("、振込日" + orders[i][3]);
				}
			}
			
		}
 }