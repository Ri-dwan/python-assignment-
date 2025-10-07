import java.util.Scanner;
public class ValidScore {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int[] scores = new int[10];
	int sum = 0;
	for (int i = 0; i < 10; i++) {
	System.out.print("Enter any valid number:");
	scores = input.nextInt();
	
	if ( scores < 0 || scores > 100 ) {
	System.out.print("Invalid");
	}

	else ( scores < 0 || score > 100 );
	scores[i] = scores;
        sum += scores;
     	
        System.out.println("Sum: " + sum);
	
  }

}
      