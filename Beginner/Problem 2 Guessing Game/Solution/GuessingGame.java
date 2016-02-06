import java.util.Scanner;
import java.util.Random;

public class GuessingGame{
	private static Scanner input = new Scanner(System.in);
	private static final int MAX_GUESS = 10;

	public static void main(String[] args){
		playGame(input);
	}

	public static void playGame(Scanner input){
		Random rand = new Random();
		int guess = 0, guessNum = rand.nextInt(MAX_GUESS),guesses = 3, turns = 0;
		String playing = "";
		double multiplier = 1.0,totalScore = 0;
		System.out.println("Do you want to play? 'y'/'n'");
		playing = input.nextLine();
		while(playing.equalsIgnoreCase("y")){
			
			System.out.println("Guess a number between 0 and "+MAX_GUESS);
			guess = input.nextInt();
			multiplier = turns < 10 ? 1 : (turns < 20 ? 1.25 : (turns < 30 ? 1.5 : turns < 40 ? 1.75 : turns < 50 ? 2 : 2.25));
			if(guess == guessNum || guesses > 1){
				if(guess < guessNum){
					System.out.println("Guess Higher");
					--guesses;	
				}else if(guess > guessNum){
					System.out.println("Guess Lower");
					--guesses;
				}else{
					System.out.println("You've guessed correctly! The number was: "+guessNum+" "+multiplier);
					guessNum = rand.nextInt(MAX_GUESS);
					guesses = 3;
					totalScore += 1*multiplier;
					turns++;
					multiplier += .25;
				}
			}else{
				System.out.println("You have ran out of guesses, do you want to play again? \"y\"/\"n\"");
				System.out.print("");
				input.nextLine();
				playing = input.nextLine();
				if(playing.equalsIgnoreCase("y")){
					guesses = 3;
					guessNum = rand.nextInt(MAX_GUESS);
					turns = 0;
					multiplier = 1.0;
					System.out.println("Your total score this round: "+totalScore);
					totalScore = 0;	
				}
			}
		}
		System.out.println("Thanks for playing! Total Score: "+totalScore);
	}

}