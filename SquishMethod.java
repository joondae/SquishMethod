//IGNORE - USED FOR TESTING
/*
import java.util.HashSet;
import java.util.Set;
*/

//Change class name
public class SquishMethod {
	/**
	 * Option A (activation function):
	 * Takes in a single number as an input between -100 and 100 (inclusive???)
	 * Outputs a number between 0 and 1 (inclusive???) relative to input number size
	 * Condition 1: given two inputs iA and iB where iA > iB, output oA must be greater than oB for all inputs
	 * Condition 2: a specific input always calculates the same output
	 * Condition 3: every unique input has a unique output
	 */
	public static double squishA(double input) {
		double output = -1;
		
		//If input isn't within acceptable range, return -1 (an invalid output)
		if(input > 100 || input < -100) {
			return output;
		}
		
		//Output determined by Sigmoid function
		output = 1/(1 + Math.exp(-1 * input));
		
		return output;
	}
	
	/**
	 * Option A continued:
	 * Takes in a single number as an input between 0 and 1 (inclusive???)
	 * Outputs a number between 0.25 and 0
	 * Condition 1: output must be greatest when input is 0.5 and smallest when input is 0 or 1
	 * Condition 2: any inputs < 0.5 produce decreasing outputs as the inputs decrease from 0.5 to 0
	 * Condition 3: any inputs > 0.5 produce decreasing outputs as the inputs increase from 0.5 to 1
	 * Condition 4: a specific input always calculates the same output
	 * Condition 5: every unique input has a unique output
	 */
	public static double closeToBoundaryA(double input) {
		double output = -1;
		
		//If input isn't within acceptable range, return -1 (an invalid output)
		if(input > 1 || input < 0) {
			return output;
		}
		
		//Output determined by piecewise function
		if(input < 0.5) {
			if(input < 0.4) {
				//For 0 < input < 0.4, y = -0.9375(x - 0.4)^2 + 0.15
				//NOTE: if input = 0, you get a floating point error when computing Math.pow(input - 0.4, 2)
				//Math.pow(input - 0.4, 2) ends up equaling 0.16000000000000003 instead of 0.16
				output = -0.9375 * Math.pow(input - 0.4, 2) + 0.15;
			}
			else if(input == 0.4) {
				//For x = 0.4, y = 0.15
				//Arbitrarily chosen "pivot point" to make the decision boundary function more interesting?
				output = 0.15;
			}
			else if(input > 0.4) {
				//For 0.4 < input < 0.5, y = -10(x - 0.5)^2 + 0.25
				output = -10 * Math.pow(input - 0.5, 2) + 0.25;
			}
		}
		else if(input == 0.5) {
			//For x = 0.5, y = 0.25
			output = 0.25;
		}
		else if(input > 0.5){
			//For 1 > x > 0.5, y = -x^2 + x
			output = (-1 * Math.pow(input, 2)) + (input);
		}
		
		return output;
	}
	
	/**
	 * Utility method to check if Condition 1 of squishA() is satisfied (IGNORE - USED FOR TESTING)
	 * NOTE: this method ignores invalid outputs
	 */
	/*
	public static boolean greaterThanCheck(double[] outputs) {
		for(int i = 0; i < outputs.length - 1; i++) {
			if(isValidSquishedOutput(outputs[i], outputs[i + 1]) && outputs[i] > outputs[i + 1])
				return false;
		}
		return true;
	}
	*/
	
	/**
	 * Utility method to check if Condition 3 of squishA() is satisfied (IGNORE - USED FOR TESTING)
	 * NOTE: this method ignores invalid outputs
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
			if(lump.contains(i) && isValidSquishedOutput(i)) {
				duplicates[count] = i;
				count++;
			}
			lump.add(i);
		}
		
		return duplicates;
	}
	*/
	
	/**
	 * Helper method to make sure invalid outputs aren't used in squishA condition checks (IGNORE - USED FOR TESTING)
	 */
	/*
	private static boolean isValidSquishedOutput(double output) {
		if(output > 1 || output < 0)
			return false;
		return true;
	}
	*/
	
	/**
	 * Overloading isValidSquishedOutput() method (IGNORE - USED FOR TESTING)
	 */
	/*
	private static boolean isValidSquishedOutput(double output1, double output2) {
		if(output1 > 1 || output1 < 0 || output2 > 1 || output2 < 0)
			return false;
		return true;
	}
	*/
	
	/**
	 * Utility method to check if Condition 2 & Condition 3 of closeToBoundaryA() are satisfied (IGNORE - USED FOR TESTING)
	 * NOTE: this method ignores invalid outputs
	 */
	/*
	public static boolean boundaryConditionsTwoAndThreeCheck(double[] outputs) {
		//Checking outputs for 0 ≤ input ≤ 0.5
		for(int i = 0; i < outputs.length/2; i++) {
			if(!isValidBoundaryOutput(outputs[i], outputs[i + 1]) && outputs[i] > outputs[i + 1])
				return false;
		}
		
		//Checking outputs for 0.5 ≤ input ≤ 1
		for(int i = outputs.length; i < outputs.length/2; i--) {
			if(isValidBoundaryOutput(outputs[i], outputs[i - 1]) && outputs[i] > outputs[i - 1])
				return false;
		}
		return true;
	}
	*/
	
	/**
	 * Utility method to check if Condition 5 of closeToBoundaryA() is satisfied (IGNORE - USED FOR TESTING)
	 * NOTE: this method ignores invalid outputs
	 */
	/*
	public static double[] boundaryUniquenessCheck(double[] outputs) {
		//Used to iterate through outputs and check for duplicates
		Set<Double> lump = new HashSet<Double>();
				
		//Array to hold any potential duplicates
		double[] duplicates = new double[outputs.length];
		int count = 0;
				
		for(double i : outputs) {
			//Second condition used to ignore any outputs resulting from an invalid input
			if(lump.contains(i) && isValidBoundaryOutput(i)) {
				duplicates[count] = i;
				count++;
			}
			lump.add(i);
		}
				
		return duplicates;
	}
	*/
	
	/**
	 * Helper method to make sure invalid outputs aren't used in closeToBoundaryA condition checks (IGNORE - USED FOR TESTING)
	 */
	/*
	private static boolean isValidBoundaryOutput(double output) {
		if(output > 0.25 || output < 0)
			return false;
		return true;
	}
	*/
	
	/**
	 * Overloading isValidBoundaryOutput() method (IGNORE - USED FOR TESTING)
	 */
	/*
	private static boolean isValidBoundaryOutput(double output1, double output2) {
		if(output1 > 0.25 || output1 < 0 || output2 > 0.25 || output2 < 0)
			return false;
		return true;
	}
	*/
}
