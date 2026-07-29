package 新しいクラス;

class RacingCarS3 extends CarS3 {
	private int course;
	
	public RacingCarS3() {
		course = 0;
		System.out.println("レーシングカーを作成しました。");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("コース番号を" + course + "にしました。");
	}
	public void newShow() {
		System.out.println("レーシングカーのナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
		System.out.println("コース番号を" + course + "です。");
	}
}