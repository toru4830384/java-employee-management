package スレッド;

class Sample5 {
	public static void main(String[] args) {
		CarS5 car1 = new CarS5("1号車");
		car1.start();
		
		try {
			car1.join();
		}
		catch (InterruptedException e) {}
		
		System.out.println("main()の処理を終わります。");
	}
}