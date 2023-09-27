package singletonDesignPattern;

import singletonDesignPattern.CandyMaker.CandyMakerHolder;

public class CandyMakerHolder {
	 private static class CandyMakerHolder {
	        private static final CandyMaker INSTANCE = new CandyMaker();
	    }

	   
	    public static CandyMaker getInstance() {
	        return CandyMakerHolder.INSTANCE;
	    }


	    public synchronized void fill() {
	        if (isEmpty()) {
	            empty = false;
	            boiled = false;
	          
	        }
	    }

	    public synchronized void drain() {
	        if (!isEmpty() && isBoiled()) {
	           
	            empty = true;
	        }
	    }

	    public synchronized void boil() {
	        if (!isEmpty() && !isBoiled()) {
	         
	            boiled = true;
	        }
	    }

	    public synchronized boolean isEmpty() {
	        return empty;
	    }

	    public synchronized boolean isBoiled() {
	        return boiled;
	    }

}
