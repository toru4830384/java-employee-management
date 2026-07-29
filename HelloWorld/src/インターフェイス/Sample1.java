package インターフェイス;

class Sample1 {
	public static void main(String[] args) {
		VehicleS1[] vc;
		vc = new VehicleS1[2];
		
		vc[0] = new CarS1(1234, 20.5);
		vc[0].setSpeed(60);
		
		vc[1] = new PlaneS1(232);
		vc[1].setSpeed(500);
		
		for (int i = 0; i < vc.length; i++) {
			vc[i].show();
		}
	}
}