package practice5;

class Calc_6 {
	void kuku() {
	     for(int i=1; i<=9; i++) {
	    	 for(int j=1; j<=9; j++) {
	    		 System.out.print((i * j) + "\t");
	    	 }
	    	 System.out.println();
	     }
    }
}
	
 public class Practice_06 {											
	  
	  public static void main(String[] args)
		{
		  
		  Calc_6 calc6 = new Calc_6(); 
		  
		  calc6.kuku();
		}
}