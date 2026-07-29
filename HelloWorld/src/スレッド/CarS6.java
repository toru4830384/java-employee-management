package スレッド;

class CarS6 implements Runnable {
	private String name;
	
	public CarS6(String nm) {
		name = nm;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
				System.out.println(name + "の処理をしています。");
		}
	}
}