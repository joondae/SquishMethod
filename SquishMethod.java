//IGNORE - USED FOR TESTING
/*
import java.util.HashSet;
import java.util.Set;
*/

public class SquishMethod {
	/**
	 * Takes in a single number as an input between -100 and 100
	 * Outputs a number between 0 and 1  relative to input number size
	 * Condition 1: given two inputs iA and iB where iA > iB, output oA must be greater than oB for all inputs
	 * Condition 2: a specific input always calculates the same output
	 * Condition 3: every unique input has a unique output
	 */
	public static double squishA(double input) {
		double output = -1;
		
		//If input isn't within acceptable range, return -1 (an invalid output)
		if(input >= 100 || input <= -100) {
			return output;
		}
		
		//Output determined by Sigmoid function
		output = 1/(1 + Math.exp(-1 * input));
		
		return output;
	}
	
	/**
	 * Utility method to check if Condition 1 is satisfied (IGNORE - USED FOR TESTING)
	 */
	/*
	public static boolean greaterThanCheck(double[] outputs) {
		for(int i = 0; i < outputs.length - 1; i++) {
			if(isValidOutput(outputs[i], outputs[i + 1]) && outputs[i] > outputs[i + 1]) {
				return false;
			}
		}
		return true;
	}
	*/
	
	/**
	 * Utility method to check if Condition 3 is satisfied (IGNORE - USED FOR TESTING)
	 */
	/*
	public static double[] uniquenessCheck(double[] outputs) {
		//Used to iterate through outputs and check for duplicates
		Set<Double> lump = new HashSet<Double>();
		
		//Array to hold any potential duplicates
		double[] duplicates = new double[outputs.length];
		int count = 0;
		
		for(double i : outputs) {
			//Second condition used to ignore any outputs resulting from an invalid input
			if(lump.contains(i) && isValidOutput(i)) {
				duplicates[count] = i;
				count++;
			}
			lump.add(i);
		}
		
		return duplicates;
	}
	*/
	
	/**
	 * Helper method to make sure invalid outputs aren't used in condition checks (IGNORE - USED FOR TESTING)
	 */
	/*
	public static boolean isValidOutput(double output) {
		if(output >= 1 || output <= 0)
			return false;
		return true;
	}
	*/
	
	/**
	 * Overloading isValidOutput() method (IGNORE - USED FOR TESTING)
	 */
	/*
	public static boolean isValidOutput(double output1, double output2) {
		if(output1 >= 1 || output1 <= 0 || output2 >=1 || output2 <=0)
			return false;
		return true;
	}
	*/
}
