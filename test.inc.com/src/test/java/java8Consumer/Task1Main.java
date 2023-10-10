package java8Consumer;

public class Task1Main {
	public static void main(String[] args) {
    	Task1ProductClass product = new Task1ProductClass("Radio", 19.99, "Electronics", 4);
    	Task1ProductPrinter productPrinter = new Task1ProductPrinter();

        productPrinter.printProduct(product, "console");

        productPrinter.printProduct(product, "file");
    }
}
