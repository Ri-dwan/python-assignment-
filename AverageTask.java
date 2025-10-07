import java.util.Scanner;

public class AverageTask {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int[] scores = new int[10];

	int averageSum = 0;
	int average = 0;
	int sum = 0;
	for(int i = 0 ; i < 10;  i++){
	System.out.print("Enter an integer: ");
	int number = input.nextInt();
	if(number < 0 || number > 100){
	continue;
	}
	sum += number;
	scores[i] =+ number;
	averageSum+=1;
	average = sum/averageSum;
	}	
	System.out.print("Average of valid scores: " + average);

	}
}