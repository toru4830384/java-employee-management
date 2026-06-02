package クラスの機能;

class Car_3 {
	
	private int num;
	private double gas;
	
	public void setCar(int n) {
		num = n;
		System.out.println("ナンバーを" + num + "にしました。");
	}
	public void setCar(double g) {
		gas = g;
		System.out.println("ガソリンの量を" + gas + "にしました。");
	}
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリンを"
				+ gas + "にしました。");
	}
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリンの量は" + gas + "です。");
	}
}

class Sample3 {											
	  
	  public static void main(String[] args)
		{
		  Car_3 car1 = new Car_3();
		  
		  car1.setCar(1234, 20.5);
		  car1.show();
		  
		  System.out.println("車のナンバーだけ変更します。");
		  car1.setCar(2345);
		  car1.show();
		  
		  System.out.println("ガソリン量だけ変更します。");
		  car1.setCar(30.5);
		  car1.show();
		}
}