package スレッド;

class Sample3 {
	public static void main(String[] args) {
		CarS3 car1 = new CarS3("1号車");
		car1.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main()の処理をしています。");
		}
	}
}