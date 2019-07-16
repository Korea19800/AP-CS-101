package chapter7;

import java.util.Scanner;

public class _08_Hangman_2 {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		/* 
		 * using Hangman_1, add following features:
		 * - randomize ANSWER *
		 * - add max guesses
		 */
		
		
		
		
		
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
