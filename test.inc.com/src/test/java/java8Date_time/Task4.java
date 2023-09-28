package java8Date_time;

	import java.time.LocalDate;
	import java.time.Period;

	public class Task4 {
	    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
	        if ((birthDate != null) && (currentDate != null)) {
	            return Period.between(birthDate, currentDate).getYears();
	        } else {
	            throw new IllegalArgumentException("Invalid date inputs");
	        }
	    }

	    public static void main(String[] args) {
	        LocalDate birthDate = LocalDate.of(1995, 10, 25);
	        LocalDate currentDate = LocalDate.now();
	        
	        int age = calculateAge(birthDate, currentDate);
	        System.out.println("Age: " + age + " years");
	    }
	}



