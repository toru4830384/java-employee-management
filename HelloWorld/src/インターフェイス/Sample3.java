package インターフェイス;

class Sample3 {
	public static void main(String[] args) {
		iVehicleS3[] ivc;
		ivc = new iVehicleS3[2];
		
		ivc[0] = new CarS3(1234, 20.5);	
		
		ivc[1] = new PlaneS3(232);
		
		for (int i = 0; i < ivc.length; i++) {
			ivc[i].show();
		}
	}
}