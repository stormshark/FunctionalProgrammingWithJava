
package dev.kaldiroglu.fpj.ch02.callback;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MyActionListener implements ActionListener{
	private MyApplication application;
	
	public MyActionListener(MyApplication application){
		this.application = application;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		JButton button = (JButton) event.getSource();
		String buttonLabel = button.getText();
		application.buttonClicked(buttonLabel);
	}
}
