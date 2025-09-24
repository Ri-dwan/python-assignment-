// prompt a user to write a program which calculate the average of three score and determine the latter grade based on the average score A,B,C,D and E.





import java.util.Scanner;
public class Average {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first score 0-100:");
	int score1 = input.nextInt();

	System.out.print("Enter the second score 0-100:");
	int score2 = input.nextInt();

	System.out.print("Enter the thired score 0-100:");
	int score3 = input.nextInt();


	double averageScore = ( score1 + score2 + score3) /3.0;

	if  ( averageScore >= 90 && averageScore <= 100) {
	    System.out.print("A");

	} else if (averageScore >= 80 && averageScore <= 90) {
	  System.out.print("B");

	} else if (averageScore >= 70 && averageScore <= 80) {
	  System.out.print("C");

	} else if (averageScore >= 60 && averageScore <= 70) {
	  System.out.print("D");

	} else {
	  System.out.print("F");
	}


    }

}
