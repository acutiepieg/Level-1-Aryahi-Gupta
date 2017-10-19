import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

	public class WhackAMole {
		JFrame frame = new JFrame();
JPanel panel = new JPanel();

public static void main(String[] args) {
			WhackAMole w = new WhackAMole();
		}
		
		public WhackAMole(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		
		for(int i = 0; i < 24; i++) {
			JButton b = new JButton();
		panel.add(b);
		b.setPreferredSize(new Dimension(70,70));
		}
		frame.setVisible(true);
		frame.setSize(510, 330);
	frame.setResizable(false);
		}
}
