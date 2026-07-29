package スレッド;

class CarS4 extends Thread {
	private String name;
	
	public CarS4(String nm) {
		name = nm;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
				System.out.println(name + "の処理をしています。");
		}
	}
}