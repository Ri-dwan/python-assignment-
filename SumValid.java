import java.util.Scanner;
public class SumValid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
	System.out.print("Enter any integer:");
        int score = input.nextInt();
        if (score >= 0 && score <= 100) 
	sum += score;
        }
        System.out.println("Sum of valid scores: " + sum);
       
    }
}