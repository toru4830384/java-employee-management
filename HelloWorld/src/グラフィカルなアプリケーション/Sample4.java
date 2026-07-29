package グラフィカルなアプリケーション;

import java.awt.*;

public class Sample4 extends Frame {
	private Button bt;
	
	public static void main(String[] args) {
		Sample4 sm = new Sample4();
	}
	public Sample4() {
		super("サンプル");
		
		bt = new Button("ようこそ");
		add(bt);
		
		addWindowListener(new SampleWindowListener());
		bt.addMouseListener(new SampleMouseListener(bt));
		
		setSize(250, 200);
		setVisible(true);
	}
}