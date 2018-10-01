/*************************************************
 * Created by: Younes Elfeitori
 * Created on: 1st October 2018
 * This program is a game of rock, paper, scissors vs a computer 
 ****************************************************/

import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String args[]){
		
		int computerChoice;
		int userChoice;
		
		computerChoice = new Random().nextInt(3) +1;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter 1 for Rock, 2 for Paper, and 3 for Scissors");

		
		userChoice = userInput.nextInt();
		
		if (userChoice == 1 && computerChoice == 1){
			System.out.println("Computer chose Rock. Draw! Try Again!");
			
		}else if (userChoice == 1 && computerChoice == 2){
			System.out.println("Computer chose paper. You Lose! Try Again!");
			
		}else if (userChoice == 1 && computerChoice == 3){
			System.out.println("Computer chose Scissors. You Win!");
		}else if (userChoice == 2 && computerChoice == 1){
			
			System.out.println("Computer Chose Rock. You Win!");
		}else if (userChoice == 2 && computerChoice == 1){
			
			System.out.println("Computer chose paper, Draw! Try Again!");
		}else if (userChoice == 2 && computerChoice == 2){
			
			System.out.println("Computer chose Scissors. You Lose! Try Again!");
		}else if (userChoice == 2 && computerChoice == 3){
			
			System.out.println("Computer chose Rock. You Win!");
		}else if (userChoice == 3 && computerChoice == 1){
			
			System.out.println("Computer chose Rock. You Lose! Try Again!");
		}else if (userChoice == 3 && computerChoice == 2){
			
			System.out.println("Computer chose Paper. You Win!");
		}else if (userChoice == 3 && computerChoice == 3){
			
			System.out.println("Computer chose Scissors. Draw! Try Again!");
		}else{
			System.out.println("Error. Please try again.");
		}
	}
}
