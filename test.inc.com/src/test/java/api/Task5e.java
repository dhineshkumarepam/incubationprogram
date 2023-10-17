package api;

import java.net.HttpURLConnection;
import java.net.URL;


public class Task5e {

	public static void main(String[] args) {
		try {
			String employeeId = "employeeId";

			String getEmployeeEndpoint = "https://events.epam.com/api/v2/events/" + employeeId;

			URL url = new URL(getEmployeeEndpoint);

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");

			int responseCode = connection.getResponseCode();

			if (responseCode == 200) { 
				System.out.println("Employee data retrived successfully .Response code: " + responseCode );
			} else {
				System.out.println("Failed to retrieve employee details. Response code: " + responseCode);
			}

			connection.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
