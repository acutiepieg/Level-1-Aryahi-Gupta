import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonListener implements ActionListener {
	public static void main(String[] args) {
		new ButtonListener();
	}
	public ButtonListener(){
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		button.setText("Aryahi's Button, DO click it");
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Thank you for clicking me. "
				+ "Now I am free of this curse, making me a button. \n  - The Button");
	}
	
}
