package グラフィカルなアプリケーション;

import java.awt.*;

public class Sample1 extends Frame {
	public static void main(String[] args) {
		Sample1 sm = new Sample1();
	}
	public Sample1() {
		super("サンプル");
		
		addWindowListener(new SampleWindowListener());
		
		setSize(250, 200);
		setVisible(true);
	}
}