package java8Predicates;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.function.Predicate;

	public class Task6Main {
	    public static void main(String[] args) {
	        List<Task6Response> responses = new ArrayList<>();

	        responses.add(new Task6Response("Response 1", 200, "JSON"));
	        responses.add(new Task6Response("Response 2", 400, "XML"));
	        responses.add(new Task6Response("Response 3", 404, "JSON"));
	        responses.add(new Task6Response("Response 4", 200, "XML"));
	        responses.add(new Task6Response("Response 5", 400, "JSON"));

	        Predicate<Task6Response> statusCode400Predicate = response -> response.getStatusCode() == 400;

	        responses.stream()
	                 .filter(statusCode400Predicate)
	                 .forEach(response -> {
	                     System.out.println("Response: " + response.getResponseBody());
	                     System.out.println("Status Code: " + response.getStatusCode());
	                     System.out.println("Response Type: " + response.getResponseType());
	                     System.out.println();
	                 });
	    }
	}


