package クラスの利用;

class Car_S6 {
	private int num;
	private double gas;
	
	public Car_S6() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}