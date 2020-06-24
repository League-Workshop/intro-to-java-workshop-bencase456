package section3;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RoboCommander {
	public static void main(String[] args) {
		Robot bob = new Robot("batman");
		bob.penDown();
		bob.setSpeed(10000);
		String shape = JOptionPane.showInputDialog("What Shape?"
				+ " Options: Rectangle, Triangle, Ellipse");
		if( shape.equalsIgnoreCase("Rectangle")){
			for (int i = 0; i < 4; i++) {
				
			
			bob.move(100);
			bob.turn(90);
			}
		}else if( shape.equalsIgnoreCase("Triangle")) {
			
		}else if(shape.equalsIgnoreCase("Ellipse")) {
			
		}else JOptionPane.showMessageDialog(null, "That is not an option");
	}

}
