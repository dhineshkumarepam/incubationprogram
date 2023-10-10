package decoratorPattern;

public class MainClass {
	 public static void main(String[] args) {
	        PageComponent myPage = new BasePage(0);

	        myPage = new FormatDecorator(myPage, "Mobile", 10);
	        myPage = new FormatDecorator(myPage, "Desktop", 20);
	        myPage = new WidgetDecorator(myPage, "Widget A", 5);
	        myPage = new WidgetDecorator(myPage, "Widget B", 8);

	        int pageRank = myPage.calculateRank();
	        System.out.println("The rank of the page is " + pageRank);
	    }
}
