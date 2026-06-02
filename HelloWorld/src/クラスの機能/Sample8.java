package クラスの機能;

class Car_8 {
	public static int sum = 0;
	
	private int num;
	private double gas;
	
	public Car_8() {
		num = 0;
		gas = 0.0;
		sum++;
		System.out.println("車を作成しました。");
	}
	public void setCar_8(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量"
				+ gas + "の車を作成しました。");
	}
	public static void showSum() {
		System.out.println("車は全部で" + sum + "台あります。");
	}
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリンの量は" + gas + "です。");	
	}
}

class Sample8 {											
	  
	  public static void main(String[] args)
		{
		  Car_8.showSum();
		  
		  Car_8 car1 = new Car_8();
		  car1.setCar_8(1234, 20.5);
		  
		  Car_8.showSum();
		  
		  Car_8 car2 = new Car_8();
		  car2.setCar_8(4567, 30.5);
		  
		  Car_8.showSum();
		}
}