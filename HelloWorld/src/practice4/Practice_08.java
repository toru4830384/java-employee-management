package practice4; 	

 public class Practice_08 {											
	  
	  public static void main(String[] args)
		{
		  
			String[] names = {
					"田中","鈴木","小川","太田"
			};
			
			String[] dep = {
					"総務部","システム開発部","総務部","営業部"
			};
			
			for(int i=0; i<names.length; i++) {
				System.out.println((i + 1) + ":" + names[i] + ":" + dep[i]);
			}
		}
 }