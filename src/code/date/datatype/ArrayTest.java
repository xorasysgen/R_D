package code.date.datatype;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static int sortMove(List<Integer> list) {
		Integer [] arr=(Integer [] )list.toArray();
		int [] array=list.stream().mapToInt(i->i).toArray();
		int counter=0;
		int temp;
	    for (int i = 0; i < array.length; i++) {
	        for (int j = i+1; j < array.length; j++) {
	            if (array[j] < array[i]) {
	            	temp=array[i];
	                array[i] = array[j];
	                array[j]=temp;
	                counter++;
	            }
	        }
	    }
		System.out.println(Arrays.toString(array));
		System.out.println(counter);
		return counter;
	}
	
	public static void main(String[] args) {
		ArrayTest.sortMove(Arrays.asList(3,1,3,2));

	}

}
