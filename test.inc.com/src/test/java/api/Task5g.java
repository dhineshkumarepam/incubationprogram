package api;
import java.net.HttpURLConnection;
import java.net.URL;

public class Task5g {
	    public static void main(String[] args) {
	        try {
	            String employeeId = "employeeId"; 
	            String createEmployeeEndpoint = "https://events.epam.com/api/v2/events";
	            String getEmployeeEndpoint = "https://events.epam.com/api/v2/events/" + employeeId;
	            String deleteEmployeeEndpoint = "https://events.epam.com/api/v2/events/" + employeeId;

	            verifyResponse(createEmployeeEndpoint);
	            verifyResponse(getEmployeeEndpoint);
	            verifyResponse(deleteEmployeeEndpoint);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    private static void verifyResponse(String endpoint) {
	        try {
	            URL url = new URL(endpoint);

	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	            int responseCode = connection.getResponseCode();
	            System.out.println("Response Code: " + responseCode);

	            String statusLine = connection.getResponseMessage();
	            System.out.println("Status Line: " + statusLine);

	            String contentType = connection.getHeaderField("Content-Type");
	            System.out.println("Content-Type: " + contentType);

	            if (responseCode == 200 || responseCode == 201 || responseCode == 204) {
	                System.out.println("Success Code: " + responseCode);
	            }

	            String contentEncoding = connection.getHeaderField("Content-Encoding");
	            System.out.println("Content-Encoding: " + contentEncoding);

	            connection.disconnect();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
