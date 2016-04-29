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

	private CoinMachine machine;

	public void setMaxStatusBar() {
		statusBar.setMaximum(machine.getCapacity());
	}

	public void updateStatus() {
		statusBar.setValue(machine.getCount());
		statusBar.setString(String.valueOf(machine.getCount()));
	}

	public void updateBalance() {
		balanceLabel.setText(String.valueOf(machine.getBalance()));
	}


	public UIBalanceNum() {
		setContentPane(contentPane);

	}

	public void run() {
		pack();
		setLocation(250,100);
		setVisible(true);
	}

	public void setMachine(CoinMachine machine) {
		this.machine = machine;
	}
}
