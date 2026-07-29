package グラフィカルなアプリケーション;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class SampleWindowListener extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}