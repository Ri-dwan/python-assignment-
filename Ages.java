//prompt a user to take two inputs(father's age,son's age) and
 //calculate how many years ago or in future father was twice as son.





import java.util.Scanner;

public class Ages {
  public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter current father's age (1-80):");
	int father = input.nextInt();

	System.out.print("Enter current age of son (1-80):");
	int son = input.nextInt();
	
         int years = Math.abs(father -2 *son);
	

	if (years == 0) {
		 System.out.println("The father is currently twice as old as his son.");

	} else if (father > 2 * son) {
		 System.out.println("THe father was twice old as his son in " + years + " years.");
	}


    }


}