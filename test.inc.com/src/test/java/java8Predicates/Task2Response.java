package java8Predicates;

public class Task2Response {
	private String responseBody;
    private int statusCode;
    private String responseType;

    public Task2Response(String responseBody, int statusCode, String responseType) {
        this.responseBody = responseBody;
        this.statusCode = statusCode;
        this.responseType = responseType;
    }
}
