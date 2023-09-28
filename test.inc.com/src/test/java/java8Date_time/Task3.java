package java8Date_time;
import java.time.ZoneId;
	import java.time.ZonedDateTime;
	import java.time.format.DateTimeFormatter;

	public class Task3 {

	    public static void main(String[] args) {
	        ZonedDateTime currentTimeEST = ZonedDateTime.now(ZoneId.of("America/New_York"));

	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	        String formattedTime = currentTimeEST.format(formatter);
	        System.out.println("Current Time in EST: " + formattedTime);
	    }
	}


