
	import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

	public class LandOfTurtles {
		static Random ran = new Random();
		public static void main(String[] args) {
			MultiTurtlePanel panel = new MultiTurtlePanel();
			String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

	// 1. Create a frame & make it visible
JFrame frame = new JFrame();
frame.setVisible(true);
			// 2. Add the panel to the frame
			frame.add(panel);
			// 3. Set the background image of the panel to the Galapagos Islands 
panel.setBackgroundImage(galapagosIslands);
frame.pack();
			// 4. Instantiate a Turtle 
Turtle tortoise = new Turtle();
	// 5. Add the turtle to the panel 
			panel.addTurtle(tortoise);
			// 6. Put 50 Turtles on the beach
for(int i = 0; i < 50; i++) {
	Turtle tortise = new Turtle();
	tortise.setX(ran.nextInt(600));
	tortise.setY(ran.nextInt(400));
	panel.addTurtle(tortise);
	
}
		}
	}



