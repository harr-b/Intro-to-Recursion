/**
 * 
 */
package edu.miamioh.bergmahb;
import java.util.Arrays;
/**
 * @author bergmahb
 *  Class that finds out the largest element in arrays using recursion
 */
public class RecursiveFinder {

	public static int largestElement(int[] start) {
	    if (start.length == 1) {
	        return start[0];
	    }
	    int max = largestElement(Arrays.copyOfRange(start, 1, start.length));
	   
	    if(start[0] > max){
	    	return start[0];
	    }else
	    {
	    	return max;
	    }
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1 = {0,3,3643,25,252,25232,3534,25,25235,2523,2426548,765836,7475,35,547,636,367,364,355,2,5,5,5,535};
		System.out.println(largestElement(array1));
		//Expected: 2426548
		int[] array2 = {1,2,3,4,5,6,7,8,9};
		System.out.println(largestElement(array2));
		//Expected: 9
		int[] array3 = {9,8,7,6,5,4,3,2,1};
		System.out.println(largestElement(array3));
		//Expected: 9
		int[] array4 = {-2,0,6,-2,5,7};
		System.out.println(largestElement(array4));
		//Expected: 7
	}

}
