package 新しいクラス;

class CarS3 {
	protected int num;
	protected double gas;
	
	public CarS3() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	public void setCarS3(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリンを" + gas + "にしました。");
	}
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}