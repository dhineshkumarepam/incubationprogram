package singletonDesignPattern;



public class CandyMakerHolder {
	
	public static class CandyMaker {
	    private boolean empty;
	    private boolean boiled;

	    private static CandyMaker instance;

	    private CandyMaker() {
	        empty = true;
	        boiled = false;
	    }

	    public static synchronized CandyMaker getInstance() {
	        if (instance == null) {
	            instance = new CandyMaker();
	        }
	        return instance;
	    }

	    public void fill() {
	        if (isEmpty()) {
	            empty = false;
	            boiled = false;
	        }
	    }

	    public void drain() {
	        if (!isEmpty() && isBoiled()) {
	            empty = true;
	        }
	    }

	    public void boil() {
	        if (!isEmpty() && !isBoiled()) {
	            boiled = true;
	        }
	    }

	    public boolean isEmpty() {
	        return empty;
	    }

	    public boolean isBoiled() {
	        return boiled;
	    }
	}

}
