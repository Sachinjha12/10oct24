package pac1;
import java.util.Scanner;
import java.util.HashSet;

public class Stringop {
	
	public static String String1(String str,int choice)
	{
		switch(choice) {
		case 1 :
			return str+str;
		case 2:
		return replaceOddpos(str);
		case 3:
			return removeDuplicateChar(str);
		case 4:
			return ChangeOddChar_toUppercase(str);
			default:
				return "Invalid choice"; }
		
	}
	private static String replaceOddpos(String str)
	{
		StringBuilder res = new StringBuilder();
		for(int i =0;i<str.length();i++)
		{
		if(i%2!=0)
		{
          res.append('#');
			
		} else
		{
			res.append(str.charAt(i));
		}
	}
		return res.toString();
	}
	
	private static String removeDuplicateChar(String str)
	{
		StringBuilder res = new StringBuilder();
		HashSet<Character> seench = new HashSet<>();
		for(char c : str.toCharArray())
		{
		   if(seench.add(c))
		   {
			   res.append(c);
		   }
		}
		
		return res.toString();
	}
	private static String ChangeOddChar_toUppercase(String str)
	{
		StringBuilder res = new StringBuilder();
		for(int i =0;i<str.length();i++)
		{
		if(i%2!=0)
		{
			
          res.append(Character.toUpperCase(str.charAt(i)));
			
		} else
		{
			res.append(str.charAt(i));
		}
	}
		return res.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the string:");
       String input = scanner.nextLine();
       
       System.out.println("Choose an operation:");
       System.out.println("1 -> Add the string to itself");
       System.out.println("2 -> Replace odd positions with #");
       System.out.println("3 -> Remove duplicate characters in the string");
       System.out.println("4 -> Change odd characters to upper case");
       
       int option = scanner.nextInt();
       String Result = String1(input,option);
       System.out.println("Result is:"+ Result);
       scanner.close();
       
       }

}
