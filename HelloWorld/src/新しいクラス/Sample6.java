package 新しいクラス;

class Sample6 {
	public static void main(String[] args) {
		CarS6[] cars = new CarS6[2];
		
		cars[0] = new CarS6();
		cars[0].setCarS6(1234, 20.5);
		
		cars[1] = new RacingCarS6();
		cars[1].setCarS6(4567, 30.5);
		
		for(int i = 0; i < cars.length; i++) {
			cars[i].show();
		}
	}
}