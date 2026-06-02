package クラスの基本; 

class Car_6 {
	int num;
	double gas;
	
	int getNum() {
		System.out.println("ナンバーを調べました。");
		return num;
	}
	double getGas() {
		System.out.println("ガソリンを調べました。");
		return gas;
	}
	void setNumGas(int n, double g) {
		num = n;
		gas = g;
		System.out.println("車のナンバーを" + num + "にガソリン量を"
				+ gas + "にしました。");
	}
	void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリンの量は" + gas + "です。");
	}
}
class Sample6 {											
	  
	  public static void main(String[] args)
	  {
		  Car_6 car1 = new Car_6();
		  
		  car1.setNumGas(1234, 20.5);
		  
		  int number = car1.getNum();
		  double gasoline = car1.getGas();
		  
		  System.out.println("サンプルから調べたところ");
		  System.out.println("ナンバーは" + number + "ガソリン量は"
				  + gasoline + "でした。");
	  }
}