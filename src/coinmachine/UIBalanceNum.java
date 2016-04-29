package coinmachine;

import javax.swing.*;
import java.awt.event.*;

public class UIBalanceNum extends JDialog {
	private JPanel contentPane;
	private JProgressBar statusBar;
	private JButton oneBahtButton;
	private JButton fiveBahtButton;
	private JButton tenBahtButton;
	private JLabel balanceLabel;


	public JProgressBar getStatusBar() {
		return statusBar;
	}

	public JLabel getBalanceLabel() {
		return balanceLabel;
	}


	public UIBalanceNum() {
		setContentPane(contentPane);
	}

	public void run() {
		pack();
		setVisible(true);
	}
}
