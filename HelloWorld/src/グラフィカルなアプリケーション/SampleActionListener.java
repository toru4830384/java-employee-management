package グラフィカルなアプリケーション;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class  SampleActionListener implements ActionListener {
	
	private Button bt;
	
	public SampleActionListener(Button bt) {
		this.bt = bt;
	}
	public void actionPerformed(ActionEvent e) {
		bt.setLabel("こんにちは。");
	}
}