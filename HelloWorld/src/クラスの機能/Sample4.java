package クラスの機能;

class Car_4 {
	
	private int num;
	private double gas;
	
	public Car_4() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリンの量は" + gas + "です。");
	}
}

class Sample4 {											
	  
	  public static void main(String[] args)
		{
		  Car_4 car1 = new Car_4();
		  
		  car1.show();
		}
}