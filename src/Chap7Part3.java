import java.util.Scanner;

public class Chap7Part3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double number1, number2, sum;
		System.out.print("Please enter the first number: ");
		number1 = input.nextDouble();
		System.out.print("Please enter the second number: ");
		number2 = input.nextDouble();

		sum = number1 + number2;
		System.out.println("The sum is " + sum);
	}
}