import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	JLabel label = new JLabel();
	char currentLetter = generateRandomLetter();

	public static void main(String[] args) {
		TypingTutor t = new TypingTutor();
		System.out.println("You typed:");
	}

	public TypingTutor() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frame.add(label);
		label.setText(String.valueOf(currentLetter));
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);

		frame.addKeyListener(this);
		frame.pack();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(String.valueOf(currentLetter));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		label.setOpaque(true);
		if(e.getKeyChar() == currentLetter) {
			System.out.println(e.getKeyChar() + " - correct");
		label.setBackground(Color.green);
		}
		else {
			System.out.println(e.getKeyChar() + " - incorrect");
			label.setBackground(Color.red);
		}
	
	}

}
