package スレッド;

class Company {
	private int sum = 0;
	public synchronized void add(int a) {
		int tmp = sum;
		System.out.println("現在、合計額は" + tmp + "です。");
		System.out.println(a + "円稼ぎました。");
		tmp = tmp + a;
		System.out.println("合計額を" + tmp + "円にします。");
		sum = tmp;
	}
}