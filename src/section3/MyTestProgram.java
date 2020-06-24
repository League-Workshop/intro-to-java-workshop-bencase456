package section3;

import javax.swing.JOptionPane;

public class MyTestProgram {
public static void main(String[] args) {
	
	
	String favFruit = JOptionPane.showInputDialog("What is your favorite fruit?");
	
	if (favFruit.equals("tomato")) {
		JOptionPane.showMessageDialog(null, ("Correct"));
	}else {
		JOptionPane.showMessageDialog(null, "Incorrect");
	}}}
	
	//JOptionPane.showMessageDialog(null, somebodysName + " Says Welcome To Jumanji!");
	
//	String userInput = JOptionPane.showInputDialog("What is your character?");
	
	
	
	//JOptionPane.showMessageDialog(null, userInput + "? That's a cool character name! "
	//		+ "But not as cool as " + somebodysName + ", of course");
	
	
//}

