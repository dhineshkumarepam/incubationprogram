package java8Predicates;

import java.util.ArrayList;
import java.util.List;

public class Task9Main {
	
	    public static void main(String[] args) {
	        List<Task9Response> responses = new ArrayList<>();

	        responses.add(new Task9Response("Response 1", 200, "JSON"));
	        responses.add(new Task9Response("Response 2", 400, "XML"));
	        responses.add(new Task9Response("Response 3", 404, "JSON"));
	        responses.add(new Task9Response("Response 4", 400, "JSON"));
	        responses.add(new Task9Response("Response 5", 500, "XML"));

	        for (Task9Response response : responses) {
	            if (response.getStatusCode() == 400 || "JSON".equals(response.getResponseType())) {
	                System.out.println("Response: " + response.getResponseBody());
	                System.out.println("Status Code: " + response.getStatusCode());
	                System.out.println("Response Type: " + response.getResponseType());
	                System.out.println();
	            }
	        }
	    }
	}


