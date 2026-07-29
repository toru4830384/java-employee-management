package スレッド;

class CarS2 extends Thread {
	private String name;
	
	public CarS2(String nm) {
		name = nm;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "の処理をしています。");
		}
	}
}