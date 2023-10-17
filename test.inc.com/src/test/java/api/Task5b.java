package api;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Task5b {
	
	    public static void main(String[] args) {
	        try {
	            String endpoint = "https://events.epam.com/api/v2/events"; 

	            URL url = new URL(endpoint);

	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            
	            connection.setRequestMethod("POST");
	            
	            connection.setRequestProperty("Content-Type", "application/json");
	            connection.setDoOutput(true);
	            
	            String employeeData = "{\"name\": \"John Doe\", \"position\": \"Software Engineer\"}";
	            
	            try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
	                wr.writeBytes(employeeData);
	                wr.flush();
	            }

	            int responseCode = connection.getResponseCode();

	            if (responseCode == 201 || responseCode == 200) { 
	                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	                String inputLine;
	                StringBuilder response = new StringBuilder();

	                while ((inputLine = reader.readLine()) != null) {
	                    response.append(inputLine);
	                }
	                reader.close();

	                String responseData = response.toString();
	                System.out.println("Employee created successfully. Response Data: " + responseData);
	            } else {
	                System.out.println("Failed to create employee. Response code: " + responseCode);
	            }

	            connection.disconnect();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

