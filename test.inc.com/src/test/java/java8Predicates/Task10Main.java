package java8Predicates;

import java.util.ArrayList;
import java.util.List;

public class Task10Main {

	    public static void main(String[] args) {
	        List<Task10Response> responses = new ArrayList<>();

	        responses.add(new Task10Response("Response 1", 200, "JSON"));
	        responses.add(new Task10Response("Response 2", 400, "XML"));
	        responses.add(new Task10Response("Response 3", 404, "JSON"));
	        responses.add(new Task10Response("Response 4", 200, "XML"));
	        responses.add(new Task10Response("Response 5", 500, "JSON"));

	        for (Task10Response response : responses) {
	            if (response.getStatusCode() != 400 && "JSON".equals(response.getResponseType())) {
	                System.out.println("Response: " + response.getResponseBody());
	                System.out.println("Status Code: " + response.getStatusCode());
	                System.out.println("Response Type: " + response.getResponseType());
	                System.out.println();
	            }
	        }
	    }
	}


