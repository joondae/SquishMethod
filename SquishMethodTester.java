import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SquishMethodTester {
	public static void main(String [] args) {
		//Testing assignment sample inputs
		System.out.println("Running sample inputs...");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("SquishA.txt"));
			bw.write("inputs: [-1337.1337, -10.5, -5.5, -1.5, -1, -0.3, -0.113, 0, 0.31, 0.76, 1.3, 1.99, 7.4, 160, 1337]\n");
			double [] inputs = new double[] {-1337.1337, -10.5, -5.5, -1.5, -1, -0.3, -0.113, 0, 0.31, 0.76, 1.3, 1.99, 7.4, 160, 1337};
			for(int i = 0; i < inputs.length; i++) {
				bw.write("\ninput: " + inputs[i] + "  |  output: " + SquishMethod.squishA(inputs[i]));
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
		
		//IGNORE - USED FOR TESTING
		/*
		System.out.println("_______\n");
		System.out.println("TEST #1");
		System.out.println("_______");
		System.out.println("inputs: [-1337.1337, -10.5, -5.5, -1.5, -1, -0.3, -0.113, 0, 0.31, 0.76, 1.3, 1.99, 7.4, 160, 1337]");
		double[] inputs = new double[] {-1337.1337, -10.5, -5.5, -1.5, -1, -0.3, -0.113, 0, 0.31, 0.76, 1.3, 1.99, 7.4, 160, 1337};
		double[] outputs = new double[inputs.length];
		for(int i = 0; i < inputs.length; i++) {
			double output = SquishMethod.squishA(inputs[i]);
			System.out.println("input: " + inputs[i] + "  |  output: " + output);
			outputs[i] = output;
		}		
		
		//Checking for collisions, assuming all inputs are unique
		double[] duplicates = SquishMethod.uniquenessCheck(outputs);
		if(duplicates.length == 0) {
			System.out.println("PASS uniqueness check");
		}
		else {
			System.out.println("FAIL uniqueness check");
			for(int i = 0; i < duplicates.length; i++) {
				System.out.println("\tDuplicate found for output " + duplicates[i]);
			}
		}
		
		//Checking if Condition 1 is satisfied
		if(SquishMethod.greaterThanCheck(outputs)) {
			System.out.println("PASS greater than check");
		}
		else {
			System.out.println("FAIL greater than check");
		}
		
		
		//Testing some integers from -100 to 100 exclusive
		System.out.println("\n\n_______\n");
		System.out.println("TEST #2");
		System.out.println("_______");
		System.out.println("inputs: some integers from -100 to 100 exclusive");
		int sizeOfSet = 401;
		double[] outputs2 = new double[sizeOfSet];
		double count = -100;
		for(int i = 0; i < sizeOfSet; i++) {
			double output = SquishMethod.squishA(count);
			System.out.println("input: " + count + "  |  output: " + output);
			outputs2[i] = output;
			count+=0.5;
		}
		
		//Checking for collisions, assuming all inputs are unique
		double[] duplicates2 = SquishMethod.uniquenessCheck(outputs2);
		if(duplicates2.length == 0) {
			System.out.println("PASS uniqueness check");
		}
		else {
			System.out.println("FAIL uniqueness check");
			for(int i = 0; i < duplicates2.length; i++) {
				System.out.println("\tDuplicate found for output " + duplicates2[i]);
			}
		}
		
		//Checking if Condition 1 is satisfied
		if(SquishMethod.greaterThanCheck(outputs2)) {
			System.out.println("PASS greater than check");
		}
		else {
			System.out.println("FAIL greater than check");
		}
		*/
	}
}
