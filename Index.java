import java.util.Scanner;
public class Index {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int [] scores = new int[10];
	int sum = 0;

	for (int i = 0; i < 10; i++) {
	System.out.print("Enter any index:");
	scores [i] = input.nextInt();
	
        if (i % 2 == 1) { sum += scores[i];
        }
	}
        System.out.println("Sum of even indexes: " + sum);

	}

}
        
