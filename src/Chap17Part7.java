import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Chap17Part7
{
	static String fileName = "/tmp/todo.txt";

	public static void main(String[] args) throws IOException
	{
		int menuItem = -1;
		while(menuItem != 0)
		{
			menuItem = menu();

			switch(menuItem)
			{
				case 1:
					showList();
					break;
				case 2:
					addItem();
					break;
				case 3:
					removeItem();
					break;
				case 0:
					break;
				default:
					System.out.println("Unrecognized input.");
			}
		}
	}

	static int menu()
	{
		int choice;
		Scanner input = new Scanner(System.in);

		System.out.println("\nMain Menu\n");
		System.out.println("0. Exit the program");
		System.out.println("1. Display the to-do list");
		System.out.println("2. Add item to to-do list");
		System.out.println("3. Remove item from to-do list");
		
		System.out.println();
		System.out.print("Enter a choice: ");
		choice = input.nextInt();
		return choice;
	}

	static void showList()
	{

	}

	static void addItem()
	{

	}

	static void removeItem()
	{

	}

}