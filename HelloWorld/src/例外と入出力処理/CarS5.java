package 例外と入出力処理;

class CarS5 {
	private int num;
	private double gas;
	
	public CarS5() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	public void setCarS5 (int n, double g) throws CarExceptionS5 {
		if (g < 0) {
			CarExceptionS5 e = new CarExceptionS5();
			throw e;
		} else {
			num = n;
			gas = g;
			System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
		}
	}
	public void show() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}