import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChuckleClicker {
public static void main(String[] args) {
	new ChuckleClicker().makeButtons();
	
}

public void makeButtons(){
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	JPanel panel1 = new JPanel();
	frame.add(panel1);
	JButton joke = new JButton();
	JButton punchline = new JButton();
	panel1.add(joke);
	panel1.add(punchline);
	JPanel panel2 = new JPanel();
	frame.add(panel2);
	JLabel label = new JLabel();
	panel2.add(label);
	frame.pack();
}
}
