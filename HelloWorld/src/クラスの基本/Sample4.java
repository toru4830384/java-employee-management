package クラスの基本; 

class Car_4 {
	int num;
	double gas;
	
	void setNum(int n) {
		num = n;
		System.out.println("車のナンバーは" + num + "です。");
	}
	void setGas(double g) {
		gas = g;
		System.out.println("ガソリンの量を" + gas + "にしました。");
	}
	void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリンの量は" + gas + "です。");	
	}
}

class Sample4 {											
	  
	  public static void main(String[] args)
	  {
		  Car_4 car1 = new Car_4();
		  
		  int number = 1234;
		  double gasoline  = 20.5;
		  
		  car1.setNum(number);
		  car1.setGas(gasoline);
	  }
}