import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener {
	JLabel label = new JLabel();
	char currentLetter = generateRandomLetter();
	static int numberOfCorrectCharactersTyped = 0;
	static Date timeAtStart1 = new Date();
	
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

	private static void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart1.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}
	Date timeAtStart = new Date();


	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(numberOfCorrectCharactersTyped == 25) {
			showTypingSpeed(25);
			System.exit(0);
		}
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
		numberOfCorrectCharactersTyped ++;
		}
		else {
			System.out.println(e.getKeyChar() + " - incorrect");
			label.setBackground(Color.red);
			numberOfCorrectCharactersTyped --;
		}
	
	}

}
