package グラフィカルなアプリケーション;

import java.awt.Button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class SampleMouseListener implements MouseListener {
	private Button bt;
	public SampleMouseListener(Button bt) {
		this.bt = bt;
	}
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {
		bt.setLabel("いらっしゃいませ。");
	}
	public void mouseExited(MouseEvent e) {
		bt.setLabel("ようこそ。");
	}
}