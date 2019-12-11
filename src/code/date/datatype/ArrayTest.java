package code.date.datatype;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static int sortMove(List<Integer> list, int start, int end) {
		int [] array=list.stream().mapToInt(i->i).toArray();
		int counter=0;
		int temp;
	    for (int i = start; i < end; i++) {
	        for (int j = start+1; j < end; j++) {
	            if (array[j] > array[i]) {
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
		ArrayTest.sortMove(Arrays.asList(3,98,56,4,1,3,2,5,8,9,23,56),1,6);

	}

}
