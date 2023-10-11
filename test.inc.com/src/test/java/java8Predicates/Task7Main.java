package java8Predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task7Main {
	
	    public static void main(String[] args) {
	        List<Task7Response> responses = new ArrayList<>();

	        responses.add(new Task7Response("Response 1", 200, "JSON"));
	        responses.add(new Task7Response("Response 2", 400, "XML"));
	        responses.add(new Task7Response("Response 3", 404, "JSON"));
	        responses.add(new Task7Response("Response 4", 200, "XML"));
	        responses.add(new Task7Response("Response 5", 400, "JSON"));

	        Predicate<Task7Response> jsonResponseTypePredicate = response -> "JSON".equals(response.getResponseType());

	        responses.stream()
	                 .filter(jsonResponseTypePredicate)
	                 .forEach(response -> {
	                     System.out.println("Response: " + response.getResponseBody());
	                     System.out.println("Status Code: " + response.getStatusCode());
	                     System.out.println("Response Type: " + response.getResponseType());
	                     System.out.println();
	                 });
	    }
	}


