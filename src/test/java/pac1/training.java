package pac1;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class training {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	 
	        // Input training start date
	        System.out.print("Enter training start date (yyyy-mm-dd): ");
	        String startDateInput = scanner.nextLine();
	        LocalDate startDate = LocalDate.parse(startDateInput);
	 
	        // Input training duration in days
	        System.out.print("Enter training duration (in days): ");
	        int duration = scanner.nextInt();
	 
	        LocalDate endDate = calculateEndDate(startDate, duration);
	        System.out.println("Training end date: " + endDate);
			
	 
		}
		private static LocalDate calculateEndDate(LocalDate startDate, int duration) {
	        LocalDate endDate = startDate;
	        int daysAdded = 0;
	 
	        while (daysAdded < duration) {
	            endDate = endDate.plusDays(1);
	            // Check if it's not Saturday or Sunday
	            if (endDate.getDayOfWeek() != DayOfWeek.SATURDAY && endDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
	                daysAdded++;
	            }
	        }
	 
	        return endDate;
	    }
	


	}



 
	