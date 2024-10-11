package pac1_oct2024;
import java.util.Scanner;
public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the number");
         int input = scanner.nextInt();
         if(input >= 0)
         {
             System.out.println("It is positive no ");
         }
         else
         {
        	 System.out.println("It is negative no "); 
         }
	
         scanner.close();
	}
}
