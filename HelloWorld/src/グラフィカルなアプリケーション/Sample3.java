package グラフィカルなアプリケーション;

import java.awt.*;

public class Sample3 extends Frame {
	private Button bt;
	
	public static void main(String[] args) {
		Sample3 sm = new Sample3();
	}
	public Sample3() {
		super("サンプル");
		
		bt = new Button("ようこそ");
		add(bt);
		
		addWindowListener(new SampleWindowListener());
		bt.addActionListener(new SampleActionListener(bt));
		
		setSize(250, 200);
		setVisible(true);
	}
}