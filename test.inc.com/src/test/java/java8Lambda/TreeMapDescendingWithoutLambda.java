package java8Lambda;
import java.util.*;

public class TreeMapDescendingWithoutLambda {

	    public static void main(String[] args) {
	        
	        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
	            @Override
	            public int compare(Integer o1, Integer o2) {
	                return o2.compareTo(o1);
	            }
	        });

	        treeSet.add(5);
	        treeSet.add(2);
	        treeSet.add(9);
	        treeSet.add(1);
	        treeSet.add(7);

	        for (Integer value : treeSet) {
	            System.out.println(value);
	        }
	    }
	}


