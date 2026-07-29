package グラフィカルなアプリケーション;

import java.awt.*;

public class Sample6 extends Frame {
	int x = 10;
	int y = 10;
	
	public static void main(String[] args) {
		Sample6 sm = new Sample6();
	}
	public Sample6() {	
		super("サンプル");
		
		addWindowListener(new SampleWindowListener());
		addMouseListener(new SampleMouseAdapter(this));
		
		setSize(250, 200);
		setVisible(true);
	}
    public void paint(Graphics g) {
    	g.setColor(Color.RED);
    	g.fillOval(x, y, 10, 10);
    }
}