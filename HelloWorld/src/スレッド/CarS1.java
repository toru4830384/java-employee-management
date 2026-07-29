package スレッド;

class CarS1 extends Thread {
	private String name;
	
	public CarS1(String nm) {
		name = nm;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "の処理をしています。");
		}
	}
}