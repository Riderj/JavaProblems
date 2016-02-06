import java.util.Scanner;

public class Calculator{

	Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Ented the first number:");
		int num1 = input.nextInt();
		System.out.println("Ented the second number:");
		int num2 = input.nextInt();

		System.out.printf("Added: %d Subtracted: %d Multiplied: %d Divided: %d",add(num1,num2),subtract(num1,num2),multiply(num1,num2),divide(num1,num2));
	}

	public static int add(int num1,int num2){
		return(num1+num2);
	}

	public static int subtract(int num1,int num2){
		return (num1-num2);
	}

	public static int multiply(int num1, int num2){
		return num1*num2;
	}

	public static double divide(int num1, int num2){
		return num1/num2;
	}
}

/*
	This problem is solved by creating four methods: add,subtract,multiply, and divide. These methods are passed two integer parameters: num1, and num2. 
	Using the return statement we return the sum, difference, product, and quotient using the built in mathematical operators. The main method prompts the
	user to input values into the console using their keyboard through the Scanner class. We ask for the first number and assign the inputted value to an integer variable num1, and do
	the same for num2. Then the results of each method are printed to the console using printf (prints out a formatted version of the text).
	

	Each method is static so we can reference it in the main method without instantiating a new Calculator object.


*/