package _03_print_and_popups._4_quiz_game;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		   int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		   javax.swing.JOptionPane.showInputDialog("what is 5x6?");
				// 2.  Ask the user a question 
					String input = javax.swing.JOptionPane.showInputDialog("Do you know the answer to  my questions?");
				// 3.  Use an if statement to check if their answer is correct
					   if(input.equals("yes")){
				// 4.  if the user's answer was correct, add one to their score 
		javax.swing.JOptionPane.showInputDialog("You were correct!");
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above
		}
				// Option: Subtract a point from their score for a wrong answer
		javax.swing.JOptionPane.showInputDialog("What do pandas like to eat?");
		
		// After all the questions have been asked, tell the user their final score 
		   javax.swing.JOptionPane.showInputDialog(5);
	}
}
