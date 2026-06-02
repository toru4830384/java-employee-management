package クラスの基本; 

class Car_2 {
	int num;
	double gas;
	
	void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリンの量は" + gas + "です。");
	}
}

class Sample2 {											
	  
	  public static void main(String[] args)
	  {
		  Car_2 car1 = new Car_2();
		  
		  car1.num = 1234;
		  car1.gas = 20.5;
		  
		  car1.show();
		  car1.show();
	  }
}