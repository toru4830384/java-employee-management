package クラスの基本; 

class Car_5 {
	int num;
	double gas;
	
	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("車のナンバーは" + num + "にガソリンの量を"
				+ gas + "にしました。");
	}
	void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリンの量は" + gas + "です。");	
	}
}

class Sample5 {											
	  
	  public static void main(String[] args)
	  {
		  Car_5 car1 = new Car_5();
		  
		  int number = 1234;
		  double gasoline = 20.5;
		  
		  car1.setNumGas(number, gasoline);
	  }
}