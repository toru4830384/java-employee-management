package スレッド;

class Sample4 {
	public static void main(String[] args) {
		CarS4 car1 = new CarS4("1号車");
		car1.start();
		
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("main()の処理をしています。");
			}
			catch (InterruptedException e) {}
		}
	}
}