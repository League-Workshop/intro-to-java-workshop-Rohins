package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		int points = 1;
		// 2. Ask the user a question
		String anwser1 = JOptionPane.showInputDialog("Does curry taste good?");
		// 3. Use an if statement to check if their answer is correct
		if (anwser1.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			JOptionPane.showMessageDialog(null, score += points);
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			JOptionPane.showMessageDialog(null,  score -= points);
		}
		String anwser2 = JOptionPane.showInputDialog("Is Marvel better than DC?");
		if (anwser2.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			JOptionPane.showMessageDialog(null, score += points);
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			JOptionPane.showMessageDialog(null,  score -= points);
		}
		String anwser3 = JOptionPane.showInputDialog("Do u no da wae?");
		if (anwser3.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "yes");
			JOptionPane.showMessageDialog(null, score += points);
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!");
			JOptionPane.showMessageDialog(null,  score -= points);
		}
		
		
		
		
		
		
		
	}
	// 4. if the user's answer is correct

	// -- add one to their score

	// 5. Create more questions by repeating steps 1, 2, and 3 below.

	// 6. After all the questions have been asked, print the user's score

}
