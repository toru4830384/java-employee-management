package クラスの機能;

class Car_6 {
	
	private int num;
	private double gas;
	
	public Car_6() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	public Car_6(int n, double g) {
		this();
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量"
				+ gas + "の車を作成しました。");
	}
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリンの量は" + gas + "です。");	
	}
}

class Sample6 {											
	  
	  public static void main(String[] args)
		{
		  Car_6 car1 = new Car_6();
		  car1.show();
		  
		  Car_6 car2 = new Car_6(1234, 20.5);
		  car2.show();
		}
}