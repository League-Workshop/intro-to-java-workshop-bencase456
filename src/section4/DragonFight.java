package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		
		ImageIcon kick = new ImageIcon("src/section4/kick.png");
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		ImageIcon yell = new ImageIcon("src/section4/yell.png");	
		
		ImageIcon dragonhit = new ImageIcon("src/section4/Dragonfire.jpeg");	
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerDamage = 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonDamage = 0;
		
		int playerSave = 0;
		
		int dragonMiss = 0;
		
		Random rand = new Random();
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String playerChoice = JOptionPane.showInputDialog("YELL  or  KICK");
		// 9. If they typed in "yell":
		if( playerChoice.equalsIgnoreCase("yell")){
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			playerSave = rand.nextInt(15+1);
			//-- Subtract that number from the dragon's health variable 
			JOptionPane.showMessageDialog(null, "You yelled to distract the dragon!", "Dragon Fighter", 0, yell);
		}
		// 10. If they typed in "kick":
		if( playerChoice.equalsIgnoreCase("KICK")) {
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			dragonDamage = rand.nextInt(1+25);
			//-- Subtract that number from the dragon's health variable
			dragonHealth = dragonHealth - dragonDamage;
			JOptionPane.showMessageDialog(null, "You kicked the Dragon!", "Dragon Fighter", 0, kick);
			
		}
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		dragonMiss = rand.nextInt(1+10);
		if( dragonMiss >= 2) {
		playerDamage = rand.nextInt(1+35) - playerSave;
		// 12. Subtract this number from the player's health
		
		playerHealth = playerHealth - playerDamage;
		JOptionPane.showMessageDialog(null, "The dragon breathed fire on you!", "Dragon Fighter", 0, dragonhit);
		}
		playerSave = 0;
		// 13. If the user's health is less than or equal to 0
		if( playerHealth < 0) {
			//-- Tell the user that they lost
			JOptionPane.showMessageDialog(null, "You got stomped! (wah wah wah waaaaaah)");
		
		// 14. Else if the dragon's health is less than or equal to 0
		}else if( dragonHealth < 0){
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			JOptionPane.showMessageDialog(null, "You have slain the dragon! Now go get your princess.");
	   //  15.  Else
		}else {
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		JOptionPane.showMessageDialog(null, "Your Health: " + playerHealth + "   Dragon's Health: " + dragonHealth);	
		}
		}
	}}

