package java8Date_time;

	import java.time.DayOfWeek;
	import java.time.LocalDate;

	public class Task2 {
	    public static LocalDate getNextThursday() {
	        LocalDate today = LocalDate.now();
	        DayOfWeek currentDayOfWeek = today.getDayOfWeek();
	        
	        int daysUntilNextThursday = DayOfWeek.THURSDAY.getValue() - currentDayOfWeek.getValue();
	        if (daysUntilNextThursday <= 0) {
	            daysUntilNextThursday += 7; 
	        }
	        
	        return today.plusDays(daysUntilNextThursday);
	    }

	    public static void main(String[] args) {
	        LocalDate nextThursday = getNextThursday();
	        System.out.println("Next Thursday is on: " + nextThursday);
	    }
	}



