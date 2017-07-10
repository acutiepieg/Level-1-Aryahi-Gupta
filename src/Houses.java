import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot r = new Robot();
	public static void main(String[] args){
	r.moveTo(10, 600);
	for(int i = 0; i < 10; i++){
		drawHouse();
	}
	
	
}

public static void drawHouse(){
	r.penDown();
	r.move(100);
	r.turn(90);
	r.move(30);
	r.turn(90);
	r.move(100);
	r.turn(270);
	r.move(20);
}
}
