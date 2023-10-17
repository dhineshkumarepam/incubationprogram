package api;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Task5d {
	    public static void main(String[] args) {
	        try {
	            String endpoint = "https://events.epam.com/api/v2/events/employeeId"; 

	            URL url = new URL(endpoint);

	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	            connection.setRequestMethod("PUT");

	            connection.setRequestProperty("Content-Type", "application/json");

	            connection.setDoInput(true);
	            connection.setDoOutput(true);

	            String updatedEmployeeData = "{\"salary\": 60000, \"age\": 30}";

	            try (OutputStream os = connection.getOutputStream()) {
	                byte[] input = updatedEmployeeData.getBytes("UTF-8");
	                os.write(input, 0, input.length);
	            }

	            int responseCode = connection.getResponseCode();

	            if (responseCode == 200 || responseCode == 204) {
	                System.out.println("Employee details updated successfully.");
	            } else {
	                System.out.println("Failed to update employee details. Response code: " + responseCode);
	            }

	            connection.disconnect();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }


}
