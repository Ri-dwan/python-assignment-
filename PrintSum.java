import java.util.Scanner;
public class PrintSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {

	  System.out.print("Enter any integer:");

            scores[i] = input.nextInt();
            sum += scores[i];
        }
        System.out.println("Sum: " + sum);
 
    }
}