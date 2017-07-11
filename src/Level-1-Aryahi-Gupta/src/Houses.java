
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	int large = 250;
	int medium = 120;
	int small = 60;
	static Robot r = new Robot();
	public static void main(String[] args){
	r.setWindowColor(Color.BLACK);
		r.moveTo(20, 600);
		r.setSpeed(10);
	drawPointyRoof(65);
	for(int i = 0; i < 10; i++){
		drawHouse(100);
	}
	drawPointyRoof(75);
	for(int i = 0; i < 3; i++){
		drawHouse(250);
		drawHouse(120);
		drawHouse(60);
	}
	drawFlatRoof(250);
	
}
	public static void drawFlatRoof(int height){
		r.setPenColor(Color.WHITE);
		r.penDown();
		r.move(height);
		r.turn(90);
		r.move(30);
		r.turn(90);
		r.move(height);
		r.turn(270);
		r.setPenColor(Color.green);
		r.move(20);
		r.turn(270);
	}
public static void drawHouse(int height){
	r.setPenColor(Color.WHITE);
	r.penDown();
	r.move(height);
	r.turn(90);
	r.move(30);
	r.turn(90);
	r.move(height);
	r.turn(270);
	r.setPenColor(Color.green);
	r.move(20);
	r.turn(270);
}
public static void drawPointyRoof(int height){
	r.setPenColor(Color.WHITE);
	r.penDown();
	r.move(height);
	r.turn(45);
	r.move(20);
	r.turn(90);
	r.move(20);
	r.turn(45);
	r.move(height);
	r.turn(270);
	r.setPenColor(Color.green);
	r.move(20);
	r.turn(270);
}


}
