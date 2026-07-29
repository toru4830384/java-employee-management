package 新しいクラス;

class RacingCarS2 extends CarS2 {
	private int course;
	
	public RacingCarS2() {
		course = 0;
		System.out.println("レーシングカーを作成しました。");
	}
	public RacingCarS2(int n, double g, int c) {
		super(n, g);
		course = c;
		System.out.println("コース番号" + course + "のレーシングカーを作成しました。");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("コース番号を" + course + "にしました。");
	}
}