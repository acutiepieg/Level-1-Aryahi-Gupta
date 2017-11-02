import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Picasso {
	Random ran = new Random();
	int random = ran.nextInt(800);
	Random ran2 = new Random();
	int random2 = ran.nextInt(800);
	Random ran3 = new Random();
	int random3 = ran.nextInt(500);
	
	public void drawPic(ColorPalette x, Color penColor) {
	Robot r = new Robot();
r.setSpeed(10);
	r.penDown();
r.setPenColor(penColor);
r.moveTo(random, random2);

for(int i = 0; i < 4; i++) {
r.move(random3);	
r.turn(90);
}


	}
}
