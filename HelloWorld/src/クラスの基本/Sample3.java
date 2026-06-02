package クラスの基本; 

class Car_3 {
	int num;
	double gas;
	
	void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリンの量は" + gas + "です。");
	}
	void showCar() {
		System.out.println("これから車の情報を表示します。");
		show();
	}
}

class Sample3 {											
	  
	  public static void main(String[] args)
	  {
		  Car_3 car1 = new Car_3();
		  
		  car1.num = 1234;
		  car1.gas = 20.5;
		  
		  car1.showCar();
	  }
}