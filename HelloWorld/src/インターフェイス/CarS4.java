package インターフェイス;

class CarS4 implements iVehicleS4, iMaterialS4 {
	private int num;
	public double gas;
	
	public CarS4(int n, double g) {
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
	}
	public void vShow() {
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
	public void mShow() {
		System.out.println("車の材料は鉄です。");
	}
}