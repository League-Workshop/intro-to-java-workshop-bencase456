package zebra.section1;

import org.jointheleague.graphical.robot.Robot;

public class RobotFreestyle {
	
	public static void main(String[] args) {
		
		// ▼ Write your code BELOW this line ▼
		
		
		// 1. Make a new Robot().  Remember to give it a name!
		Robot bob = new Robot("batman");
		// 2. Make your robot move()
		bob.setSpeed(200000);
		bob.move(200);
		// 3. Make your robot turn()  
		bob.turn(360/5);
		// 4. Make your robot put its penDown()
		bob.penDown();
		// 5. Make your robot move() some more.  What do you see?
		for (int i = 0; i < 5; i++) {
			
		bob.move(200);
		bob.turn(360/5);
		
		}
		// 6. Can you make your robot draw a square?  A triangle?  Something cool?
		
		
		
		
		
		
		
		
		
		// Bonus: Can you make your robot sparkle? miniaturize? draw with a different color?
		
		
		// ▲ Write your code ABOVE this line ▲
		
	}
	
}
