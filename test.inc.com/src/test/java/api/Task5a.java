package api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Task5a {
	 public static void main(String[] args) {
	        try {
	            String endpoint = "https://events.epam.com/api/v2/events";

	            URL url = new URL(endpoint);

	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.setRequestMethod("GET");

	            int responseCode = connection.getResponseCode();

	            if (responseCode == 200) {
	                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	                String inputLine;
	                StringBuilder response = new StringBuilder();

	                while ((inputLine = reader.readLine()) != null) {
	                    response.append(inputLine);
	                }
	                reader.close();

	                String responseData = response.toString();
	                System.out.println("Response Data: " + responseData);

	            } else {
	                System.out.println("Failed to retrieve data. Response code: " + responseCode);
	            }

	            connection.disconnect();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
