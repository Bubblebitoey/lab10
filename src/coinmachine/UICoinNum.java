package coinmachine;

import javax.swing.*;

public class UICoinNum extends JDialog {
	private JPanel contentPane;
	private JButton buttonOK;

	public UICoinNum() {
		setContentPane(contentPane);
		setModal(true);
		getRootPane().setDefaultButton(buttonOK);
	}

	public static void main(String[] args) {
		UICoinNum dialog = new UICoinNum();
		dialog.pack();
		dialog.setVisible(true);
		System.exit(0);
	}
}
