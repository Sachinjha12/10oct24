package pac1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;


public class datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Instant CurrentTime =  Instant.now(); 
       
//       DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      
       LocalDate now = LocalDate.now();
       
       System.out.println("Current time is :" + CurrentTime);
       System.out.println("Today:"+now);
       System.out.println("Today date in dd/mm/yyyy format:"+ now.format(formatter));
       System.out.println("Tommorrow:"+now.plusDays(1));
       System.out.println("Yesterday:"+now.minusDays(1));
       System.out.println("Last month:"+now.minusMonths(1));
       System.out.println("This year is leap year (T/F):"+now.isLeapYear());
       System.out.println("Training and date:"+now.plusDays(48));
       
       ZonedDateTime CT = ZonedDateTime.now();
       ZonedDateTime CT_paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
       
       System.out.println("Current time is :" + CT);
       System.out.println("Current time in paris :" + CT_paris);
       System.out.println("Yesterday Paris :" + CT_paris.minusDays(1));
       System.out.println("Last month in paris:"+CT_paris.minusMonths(1));
       System.out.println(" Move 30th day of the month in paris:"+CT_paris.withDayOfMonth(30));
       System.out.println("Training and date in paris:"+CT_paris.plusDays(48));
 
       ZonedDateTime CT_Aus = ZonedDateTime.now(ZoneId.of("Australia/Sydney")); 
       System.out.println("Current time in Australia :" + CT_Aus);
       
       LocalDate start = LocalDate.of(1947, Month.AUGUST, 15);
       LocalDate end = LocalDate.now();
       Period period = start.until(end);
       
       System.out.println("Days:"+period.get(ChronoUnit.DAYS));
       System.out.println("Months:"+period.get(ChronoUnit.MONTHS));
       System.out.println("Years:"+period.get(ChronoUnit.YEARS));
       
       
	}

}
