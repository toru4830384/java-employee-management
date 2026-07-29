package スレッド;

class CarS3 extends Thread {
	private String name;
	
	public CarS3(String nm) {
		name = nm;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(1000);
				System.out.println(name + "の処理をしています。");
			}
			catch (InterruptedException e) {}
		}
	}
}