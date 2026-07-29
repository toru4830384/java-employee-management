package グラフィカルなアプリケーション;

import java.awt.*;

public class Sample2 extends Frame {
	private Label lb;
	
	public static void main(String[] args) {
		Sample2 sm = new Sample2();
	}
	public Sample2() {
		super("サンプル");
		
		lb = new Label("ようこそ");
		
		add(lb);
		
		lb.setForeground(Color.blue);
		lb.setFont(new Font("Serif", Font.BOLD, 24));
		
		addWindowListener(new SampleWindowListener());
		
		setSize(250, 200);
		setVisible(true);
	}
}