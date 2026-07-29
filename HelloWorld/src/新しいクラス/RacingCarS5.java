package 新しいクラス;

class RacingCarS5 extends CarS5 {
	private int course;
	
	public RacingCarS5() {
		course = 0;
		System.out.println("レーシングカーを作成しました。");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("コース番号を" + course + "にしました。");
	}
	public void show() {
		System.out.println("レーシングカーのナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
		System.out.println("コース番号は" + course + "です。");
	}
}