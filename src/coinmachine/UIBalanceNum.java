package coinmachine;

import javax.swing.*;
import java.awt.event.*;

public class UIBalanceNum extends JDialog {
	private JPanel contentPane;
	private JProgressBar progressBar1;
	private JButton buttonOK;
	private JButton buttonCancel;

	public UIBalanceNum() {
		setContentPane(contentPane);
	}

	public static void main(String[] args) {
		UIBalanceNum dialog = new UIBalanceNum();
		dialog.pack();
		dialog.setVisible(true);
	}
}
