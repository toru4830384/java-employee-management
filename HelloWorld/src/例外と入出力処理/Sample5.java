package 例外と入出力処理;

class Sample5 {
	public static void main(String[] args) {
		CarS5 car1 = new CarS5();
		try {
			car1.setCarS5(1234, -10.0);
		} catch (CarExceptionS5 e) {
			System.out.println(e + "が送出されました。");
		}
		car1.show();
	}
}