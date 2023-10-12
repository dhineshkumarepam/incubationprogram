package java8Predicates;

public class Task5Response {
	private String responseBody;
    private int statusCode;
    private String responseType;

    public Task5Response(String responseBody, int statusCode, String responseType) {
        this.responseBody = responseBody;
        this.statusCode = statusCode;
        this.responseType = responseType;
    }
}
