package グラフィカルなアプリケーション;

import java.awt.*;

import javax.swing.ImageIcon;


public class Sample5 extends Frame {
	Image im;
	
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		Sample5 sm = new Sample5();
	}
	public Sample5() {
		
		super("サンプル");
		
		Toolkit tk = getToolkit();
		im = tk.getImage("top.jpg");

		MediaTracker mt = new MediaTracker(this);
		mt.addImage(im, 0);

		try {
		    mt.waitForAll();
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		addWindowListener(new SampleWindowListener());
		
		setSize(250, 200);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		boolean result = g.drawImage(im, 100, 100, this);
	    System.out.println(result);
	}
}