package グラフィカルなアプリケーション;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class SampleMouseAdapter extends MouseAdapter {
	private Sample6 frame;
	
	public SampleMouseAdapter(Sample6 frame) {
		this.frame = frame;
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		frame.x = e.getX();
		frame.y = e.getY();
		frame.repaint();
	}
}