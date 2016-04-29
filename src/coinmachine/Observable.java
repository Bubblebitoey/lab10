package coinmachine;

import java.awt.*;
import java.util.*;

/**
 * Created by bubblebitoey on 28/4/59.
 */
class Observable implements Observer {
	private UICoinNum coinNum = new UICoinNum();
	private UIBalanceNum balanceNum = new UIBalanceNum();


	public Observable() {
		coinNum.run();
		balanceNum.run();
	}

	@Override
	public void update(java.util.Observable o, Object arg) {
		if (o != null) {
			balanceNum.setMaxStatusBar();
			CoinMachine machine = (CoinMachine) o;

			if (machine.isFull()) {
				coinNum.getAcceptCoin().setText("FULL");
				coinNum.getAcceptCoin().setForeground(new Color(255, 95, 178, 255));
			}
			coinNum.getTextField1().setText(String.valueOf(machine.getCount()));
			balanceNum.updateBalance();
			balanceNum.updateStatus();
		}
		System.out.println();
	}

	public void setMachine(CoinMachine machine) {
		balanceNum.setMachine(machine);
	}
}
