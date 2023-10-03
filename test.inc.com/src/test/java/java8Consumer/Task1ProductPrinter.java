package java8Consumer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.function.Consumer;

public class Task1ProductPrinter {
	private final Consumer<Task1ProductClass> consolePrinter = product -> System.out.println(product);
    private final Consumer<Task1ProductClass> fileLogger = this::logProductToFile;

    public void printProduct(Task1ProductClass product, String printParameter) {
        Consumer<Task1ProductClass> printer;
        if ("file".equalsIgnoreCase(printParameter)) {
            printer = consolePrinter.andThen(fileLogger);
        } else {
            printer = consolePrinter;
        }
        printer.accept(product);
    }

    private void logProductToFile(Task1ProductClass product) {
        try (FileWriter fileWriter = new FileWriter("product_log.txt", true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(product);
            System.out.println("Product logged to file: product_log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
