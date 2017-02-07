/**
 * 
 */
package edu.miamioh.bergmahb;

/**
 * @author bergmahb Class that reverses a String
 */
public class Reverser {

	// Recursive method that calls itself to move down the string and add
	// the first letter to the end of the string
	public static String reverse(String text) {
		if (text.length() <= 1){
			return text;
		}
		return reverse(text.substring(1)) + text.charAt(0);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("'String' in reverse is " + reverse("String"));
		// Expected gnirtS
		System.out.println("'True Stories' in reverse is " + reverse("True Stories"));
		// Expected seirotS eurT
		System.out.println("'Miami University Redhawks!' in reverse is " + reverse("Miami University Redhawks!"));
		// Expected !skwahdeR ytisrevinU imaiM
	}

}
