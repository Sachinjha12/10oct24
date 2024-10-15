package pac1;
import java.util.Scanner;

public class pos1string {

	
	public static boolean isPositiveString(String str)
	{
		str = str.toUpperCase();
		for(int i =1;i<str.length();i++)
		{
			if(str.charAt(i)< str.charAt(i-1))
				return false;
				
		}
	return true;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test1 = "ANT";
		String test2 = "BMC";
		String test3 = "NCD";
		
		System.out.println("is"+test1+"positive string:"+isPositiveString(test1));
		System.out.println("is"+test2+"positive string:"+isPositiveString(test2));
		System.out.println("is"+test3+"positive string:"+isPositiveString(test3));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string:");
		String input = scanner.nextLine();
		if(isPositiveString(input))
		{
			System.out.println("It is positive string");
		}
		else
		{
			System.out.println("It is negative string");
		}
	}

}
