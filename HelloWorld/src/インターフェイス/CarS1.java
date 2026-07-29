package インターフェイス;

class CarS1 extends VehicleS1 {
	private int num;
	public double gas;
	
	public CarS1(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
	}
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
		System.out.println("速度は" + speed + "です。");
	}
}