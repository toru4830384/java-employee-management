package インターフェイス;

class Sample2 {
	public static void main(String[] args) {
		VehicleS1[] vc;
		vc = new VehicleS1[2];
		
		vc[0] = new CarS1(1234, 20.5);	
		vc[1] = new PlaneS1(232);
		
		for (int i = 0; i < vc.length; i++) {
			if (vc[i] instanceof CarS1)
				System.out.println((i + 1) + "番目のオブジェクトはCarクラスです。");
			else
				System.out.println((i + 1) + "番目のオブジェクトはCarクラスではありません。");
		}
	}
}