package api;
import java.net.HttpURLConnection;
import java.net.URL;

public class Task5f {
	
	    public static void main(String[] args) {
	        try {
	            String employeeId = "employeeId"; 
	            String endpoint = "https://events.epam.com/api/v2/events/" + employeeId;

	            URL url = new URL(endpoint);

	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	            connection.setRequestMethod("DELETE");

	            int responseCode = connection.getResponseCode();

	            if (responseCode == 204) { 


	                System.out.println("Employee deleted successfully.");
	            } else {
	                System.out.println("Failed to delete employee. Response code: " + responseCode);
	            }

	            connection.disconnect();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


