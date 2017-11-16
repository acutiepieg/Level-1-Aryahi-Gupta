import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	JTextField tf1 = new JTextField(15);
	JTextField tf2 = new JTextField(15);

	JButton ans = new JButton();

	JButton add = new JButton("+");
	JButton sub = new JButton("-");
	JButton mult = new JButton("x");
	JButton divi = new JButton("/");

	public static void main(String[] args) {
		Calculator cal = new Calculator();
	}

	public Calculator() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

		frame.add(p1, BorderLayout.NORTH);
		frame.add(p2, BorderLayout.CENTER);
		frame.add(p3, BorderLayout.SOUTH);

		// panel 1

		p1.add(tf1);
		p1.add(tf2);

		// panel 2

		makeButton(p2, add);
		makeButton(p2, sub);
		makeButton(p2, mult);
		makeButton(p2, divi);

		// panel 3
		p3.add(ans);

		frame.pack();

	}

	private void makeButton(JPanel p2, JButton add) {
		p2.add(add);
		add.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Double num1 = Double.parseDouble(tf1.getText());
		Double num2 = Double.parseDouble(tf2.getText());
		Double ans2;

		if (e.getSource() == add) {
			ans2 = num1 + num2;
		} else if (e.getSource() == sub) {
			ans2 = num1 - num2;
		} else if (e.getSource() == mult) {
			ans2 = num1 * num2;
		} else {
			ans2 = num1 / num2;
		}
		String answer = String.format("%.5f", ans2);
		ans.setText(answer);

	}
}
