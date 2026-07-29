package 新しいクラス;

class CarS2 {
	private int num;
	private double gas;
	
	public CarS2() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	public CarS2(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリンを" + gas + "にしました。");
	}
	public void setCar_S1(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリンを" + gas + "にしました。");
	}
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}