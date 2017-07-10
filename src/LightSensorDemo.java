package demos;

import java.io.IOException;

import org.jointheleague.ecolban.rpirobot.IRobotAdapter;
import org.jointheleague.ecolban.rpirobot.IRobotInterface;
import org.jointheleague.ecolban.rpirobot.SimpleIRobot;

public class LightSensorDemo extends IRobotAdapter {
	Sonar sonar = new Sonar();

	public LightSensorDemo(IRobotInterface iRobot) {
		super(iRobot);
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Try event listner, rev Monday 2030");
		IRobotInterface base = new SimpleIRobot();
		LightSensorDemo rob = new LightSensorDemo(base);
		rob.setup();
		while (rob.loop()) {
		}
		rob.shutDown();
	}

	private void setup() throws Exception {
		driveDirect(100, 100);
	}

	private boolean loop() throws Exception {
		readSensors(100);// <--gotta read them sensors

		// getLightBumps() returns an array of length 6 (elements 0 - 5)
		// element 0 is the far left light sensor
		// element 5 is the far right light sensor
		// elements 1-4 are the sensors inbetween from left to right
		int[] lightBumpReadings = getLightBumps();

		// if the sensors don't detect anything, they return 0
		// otherwise they return some positive integer
		// the higher the integer the closer the object

		if (lightBumpReadings[0] > 0) {
			System.out.println("Sensor 0 is " + lightBumpReadings[0]);
			driveDirect(200, -200);
			sleep(500);
			driveDirect(0, 0);
		} else if (lightBumpReadings[1] > 0) {
			System.out.println("Sensor 1 is " + lightBumpReadings[1]);
			driveDirect(200, -200);
			sleep(500);
			driveDirect(0, 0);
		} else if (lightBumpReadings[2] > 0) {
			System.out.println("Sensor 2 is " + lightBumpReadings[2]);
			driveDirect(-200, -200);
			sleep(500);
			driveDirect(0, 0);
		} else if (lightBumpReadings[3] > 0) {
			System.out.println("Sensor 3 is " + lightBumpReadings[3]);
			driveDirect(-200, -200);
			sleep(500);
			driveDirect(0, 0);
		} else if (lightBumpReadings[4] > 0) {
			System.out.println("Sensor 4 is " + lightBumpReadings[4]);
			driveDirect(-200, 200);
			sleep(500);
			driveDirect(0, 0);
		} else if (lightBumpReadings[5] > 0) {
			System.out.println("Sensor 5 is " + lightBumpReadings[5]);
			driveDirect(-200, 200);
			sleep(500);
			driveDirect(0, 0);
		}

		return true;
	}

	private void sleep(int amt) {
		try {
			Thread.sleep(amt);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void shutDown() throws IOException {
		reset();
		stop();
		closeConnection();
	}
}