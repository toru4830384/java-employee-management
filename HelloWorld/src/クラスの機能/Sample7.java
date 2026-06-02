package クラスの機能;

class Car_7 {
	
	private int num;
	private double gas;
	
	public Car_7() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	public void setCar_7(int n, double g) {
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

class Sample7 {											
	  
	  public static void main(String[] args)
		{
		  Car_7 car1 = new Car_7();
		  car1.setCar_7(1234, 20.5);
		  car1.show();
		  
		  Car_7 car2 = new Car_7();
		  car2.setCar_7(4567, 30.5);
		  car2.show();
		}
}