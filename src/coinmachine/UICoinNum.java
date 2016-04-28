package coinmachine;

import javax.swing.*;

public class UICoinNum extends JDialog {
	private JPanel contentPane;

	private JTextField textField1;
	private JLabel acceptingCoin;

	public UICoinNum() {
		setContentPane(contentPane);
	}

	public JTextField getTextField1() {
		return textField1;
	}

	public JLabel getAcceptCoin() {
		return acceptingCoin;
	}

	public void run() {
		pack();
		setVisible(true);
	}
}
