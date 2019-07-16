package chapter7;

import java.util.Scanner;

public class _07_Hangman_1 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		// 1. print title and initialize variables:
		// - ANSWER: correct word
		// - show: the current state of the game
		// - isDone, a status variable
		// - guess, a string to store Scanner input.


		
		// 2. create a while loop that runs while isDone is false
		// - prompt user for a single character
		// - if user guessed correctly, update show. if not, don't update.
		// - if show is equal to ANSWER, end game. if not, continue

		
		
		console.close();
	}
	
	/**
	 * returns a string that contains only "-"s
	 * the number of "-"s is equal to the number of characters in ans
	 * @param ans
	 * @return
	 */
	public static String initShow(String ans) {

		
		return ans;
	}
	
	/**
	 * returns a updated version of show.
	 * if guess is in ANSWER, 
	 * return a updated version of show that shows all occurrences of guess
	 * no other parts of show must be changed.
	 * @param ANSWER
	 * @param show
	 * @param guess
	 * @return
	 */
	public static String updateShow(String ANSWER, String show, String guess) {
		
		return show;
	}
	
}
