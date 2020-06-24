package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String coding = JOptionPane.showInputDialog("Can you code?");
		// 2. If they say "yes", tell them they will rule the world.
if( coding.equalsIgnoreCase("yes")){
	JOptionPane.showMessageDialog(null, "Congratulations, the world will soon be yours to rule!");
}else {
		// 3. Otherwise, wish them good luck washing dishes.
JOptionPane.showMessageDialog(null, "Well then, good luck washing dishes in a world owned by coders!");
	
}}}

