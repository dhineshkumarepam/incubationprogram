package java8Date_time;

	import java.time.LocalDate;
	import java.time.temporal.ChronoUnit;
	import java.util.function.Predicate;

	public class Task1 {
	    public static void main(String[] args) {
	       
	        LocalDate dateToCheck = LocalDate.of(2023, 9, 26);
	        
	        Predicate<LocalDate> isYesterday = date -> 
	                date.isEqual(LocalDate.now().minus(1, ChronoUnit.DAYS));
	        
	        if (isYesterday.test(dateToCheck)) {
	            System.out.println("The given date is yesterday's date.");
	        } else {
	            System.out.println("The given date is not yesterday's date.");
	        }
	    }
	}



