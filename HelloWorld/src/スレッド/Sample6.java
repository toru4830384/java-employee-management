package スレッド;

class Sample6 {
	public static void main(String[] args) {
		CarS6 car1 = new CarS6("1号車");
		Thread th1 = new Thread(car1);
		th1.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main()の処理をしています。");
		}
	}
}