package 新しいクラス;

class CarS7 {
	protected int num;
	protected double gas;
	
	public CarS7() {
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
	public void setCarS7(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリンを" + gas + "にしました。");
	}
	public String toString() {
		String str = "ナンバー:" + num + "ガソリン量:" + gas ;
		return str;
	}
}