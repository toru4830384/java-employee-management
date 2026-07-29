package クラスの利用;

import java.io.*;

class Sample8 {
	public static void main(String[] args) throws IOException {
		Car_S8 car1;
		car1 = new Car_S8();
		
		car1.show();
		
		int number = 1234;
	    double gasoline = 20.5;
	    String str = "1号車";
		
		car1.setCar(number, gasoline);
		car1.setName(str);
		
		car1.show();
	}
}