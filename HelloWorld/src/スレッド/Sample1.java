package スレッド;

class Sample1 {
	public static void main(String[] args) {
		CarS1 car1 = new CarS1("1号車");
		car1.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main()の処理をしています。");
		}
	}
}