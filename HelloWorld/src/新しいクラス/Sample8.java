package 新しいクラス;

class Sample8 {
	public static void main(String[] args) {
		CarS8 car1 = new CarS8();	
		CarS8 car2 = new CarS8();
		
		CarS8 car3 = car1;
		
		boolean b11 = car1.equals(car2);
		boolean b12 = car1.equals(car3);
		
		System.out.println("car1とcar2が同じか調べたところ" + b11 + "でした。");
		System.out.println("car1とcar3が同じか調べたところ" + b12 + "でした。");
	}
}