import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.teachingextensions.logo.Colors;

public class ChuckleClicker implements ActionListener {
	JButton joke = new JButton();
	JButton punch = new JButton();
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	
int idx = 0;
	String[] jokes = { "How do you make an octopus laugh?", "Joke 2", "Joke 3"};
	String[] punchlines = { "With ten-tickles", "Punchline 2", "Punchline 3"};
	public static void main(String[] args) {
	new ChuckleClicker().makeButtons();
	
}

public void makeButtons(){
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel1 = new JPanel();
	frame.add(panel1);
	panel1.add(joke);
	panel1.add(punch);
	panel1.setBackground(Colors.Blues.CadetBlue);
	JPanel panel2 = new JPanel();
	frame.add(panel2);
	panel2.setBackground(Colors.Blues.CornflowerBlue);
	panel2.add(label);
	frame.setSize(700, 500);
	frame.setLayout(new GridLayout (2,1));
	joke.setText("Joke");
	punch.setText("Punchline");
	frame.pack();
	frame.setVisible(true);
	
	joke.addActionListener(this);
	punch.addActionListener(this);
	punch.setEnabled(false);
	
	
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(idx == 3) {
		idx = 0;
	}
	
	if(e.getSource() == joke) {
		label.setText(jokes[idx]);
		frame.pack();
	punch.setEnabled(true);
	}
	
	if(e.getSource() == punch) {
		label.setText(punchlines[idx]);
		idx ++;
		punch.setEnabled(false);
		frame.pack();
	}
}
}
