package lab8;

import java.util.Scanner;
import java.util.Arrays;

//Darby O'Rear 7/24

//Write a program that will recognize invalid inputs when the user requests information about students in a class.
public class Lab8 {
	public static void main(String[] args) {
		
		
//Create the dataset. Should consist of a list of students' names and two facts about each student (so, three parallel arrays total).
		
		//Make an array with at least 8 students.
		
//		if you want, you can use the Validator class we made.

		String studentNum[] = {"1 = Kris", "\n 2 = Louis", "\n 3 = Sharde", "\n 4 = Virginia", "\n 5 = Amna", "\n 6 = Jasmine", "\n 7 = Shontinique", "\n 8 = Tim", "\n 9 = Arif", "\n 10 = Eddy"};
		String names[] = {"Kris", "Louis", "Sharde", "Virginia", "Amna", "Jasmine", "Shontinique", "Tim", "Arif", "Eddy"};
		String faveFoods[] = {"Thai", "Wasabi peas", "Japanese", "chocolate", "coffee", "Alfredo", "bread", "cookies", "pizza", "hamburgers"};
		String faveAnimals[] = {"dog", "cat", "horse", "duck", "rabbit", "ferret", "guinea pig", "fox", "hamster", "flamingo"};
	
//Ask user what student they want to learn about.
		System.out.println("Hello! Thanks for wanting to learn more about Grand Circus students. Here is a list of our students: ");
		String studentNumString = Arrays.toString(studentNum);
		System.out.println(studentNumString);
		System.out.println();
//	}
//	
//		public static String learnSomethingNew(String randomName) {
		System.out.println("Please enter the number for the student you want to learn more about: ");
		Scanner scnr = new Scanner(System.in);
		int wantToLearnAbout = scnr.nextInt();
		String studentName = names[wantToLearnAbout - 1];
		
		
		System.out.println("What would you like to know about " + studentName + "? Would you like to know his/her favorite food or favorite animal?");
		scnr = new Scanner(System.in);
		String learnNewFact = scnr.nextLine();
		
		if(learnNewFact.equals("favorite animal") || learnNewFact.equals("animal")) {
			String faveAnimal = faveAnimals[wantToLearnAbout - 1];
			System.out.println(studentName + "\'s favorite animal " + "is a " + faveAnimal + ".");
			System.out.println();

		} else if (
			learnNewFact.equals("favorite food") || learnNewFact.equals("food")){
				String faveFood = faveFoods[wantToLearnAbout - 1];
				System.out.println(studentName + "\'s favorite food " + "is " + faveFood + ".");
				System.out.println();
			} else {				
				System.out.println("Sorry, that's not something I can tell you about " + studentName + "."); //TRY-CATCH??
				}
		
		System.out.println("Would you like to learn another fact about a Grand Circus student? Please type yes or no: " );
		System.out.println();
		String userContinue = scnr.next();
		
		while (userContinue.equals("yes")) {    //use try-catch to include "y"?
			//LOOP
			//method(lines 30-52).
		}
		
	
	
	}

}
