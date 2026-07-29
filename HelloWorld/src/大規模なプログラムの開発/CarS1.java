package 大規模なプログラムの開発;

class CarS1 {
	private int num;
	private double gas;
	
	public CarS1() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	public void setCarS1(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}