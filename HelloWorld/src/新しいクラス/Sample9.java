package 新しいクラス;

class Sample9 {
	public static void main(String[] args) {
		CarS9[] cars = new CarS9[2];	
		
		cars[0] = new CarS9();
		cars[1] = new RacingCarS9();
		
		for(int i = 0; i < cars.length; i++) {
			Class c1 = cars[i].getClass();
			System.out.println((i + 1) + "番目のオブジェクトのクラスは" + c1 + "です。");
		}
	}
}