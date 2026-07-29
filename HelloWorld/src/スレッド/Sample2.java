package スレッド;

class Sample2 {
	public static void main(String[] args) {
		CarS2 car1 = new CarS2("1号車");
		car1.start();
		
		CarS2 car2 = new CarS2("2号車");
		car2.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main()の処理をしています。");
		}
	}
}