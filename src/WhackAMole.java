import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	JButton mole = new JButton();
	static int counter;
	static int molesWhacked;
	static Date startTime = new Date();
	
	public static void main(String[] args) {
		WhackAMole w = new WhackAMole();
	}

	public WhackAMole() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);

		Random r = new Random();
		int random = r.nextInt(24);

		for (int i = 0; i < 24; i++) {
			if (random == i) {
				mole.addActionListener(this);
				panel.add(mole);
				mole.setText("mole!");
				mole.setPreferredSize(new Dimension(70, 70));
			}
			else {
				JButton b = new JButton();
				panel.add(b);
				b.setPreferredSize(new Dimension(70, 70));
				b.addActionListener(this);
			}
		}
		frame.setVisible(true);
		frame.setSize(510, 330);
		frame.setResizable(false);

	}

	private void endGame(Date timeAtStart) {
		Date timeAtEnd = new Date();
		System.out.println(molesWhacked);
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+( ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00) / molesWhacked) + " seconds per mole.");
		}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
if(e.getSource() == mole) {
	counter++;
	molesWhacked++;
	frame.dispose();
	WhackAMole newWhack = new WhackAMole();
}
else {
	counter++;
	frame.dispose();
	JOptionPane.showMessageDialog(null,"Try to hit the word 'mole!'");
	WhackAMole w2 = new WhackAMole();
}
	if(counter == 10) {
		endGame(startTime);
		System.exit(0);
	}
	
	}

}
