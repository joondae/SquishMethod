import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//Change class name
public class SquishMethodTester {
	public static void main(String [] args) {
		//Testing assignment sample inputs
		//NOTE: if you get java.lang.ClassNotFoundException when running tester, go to menubar, use Project -> Clean... then run again 
		System.out.println("Running sample inputs...");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("SquishA.txt"));
			double[] squishInputs = new double[] {-1337.1337, -10.5, -5.5, -1.5, -1, -0.3, -0.113, 0, 0.31, 0.76, 1.3, 1.99, 7.4, 160, 1337};
			double[] squishOutputs = new double[squishInputs.length];
			bw.write("Squish function (A):\n");
			bw.write("inputs (" + squishInputs.length + "): [-1337.1337, -10.5, -5.5, -1.5, -1, -0.3, -0.113, 0, 0.31, 0.76, 1.3, 1.99, 7.4, 160, 1337]\n");
			for(int i = 0; i < squishInputs.length; i++) {
				double output = SquishMethod.squishA(squishInputs[i]);
				squishOutputs[i] = output;
				bw.write("\ninput: " + squishInputs[i] + "  |  output: " + output);
			}
			bw.close();
			System.out.println("\tDone running squish function");
			
			BufferedWriter bw2 = new BufferedWriter(new FileWriter("CloseToBoundaryA.txt"));
			double[] boundaryInputs = new double[] {0, 0.000027535691114583473, 0.004070137715896128, 0.18242552380635635, 0.2689414213699951, 0.425557483188341, 0.47178002201963243, 0.5, 0.5768852611320463, 0.6813537337890256, 0.7858349830425586, 0.8797431375322491, 0.9993891206405656, 1, 1};
			double[] boundaryOutputs = new double[boundaryInputs.length];
			bw2.write("Close to boundary function (A):\n");
			bw2.write("inputs (" + boundaryInputs.length + "): [0, 0.000027535691114583473, 0.004070137715896128, 0.18242552380635635, 0.2689414213699951, 0.425557483188341, 0.47178002201963243, 0.5, 0.5768852611320463, 0.6813537337890256, 0.7858349830425586, 0.8797431375322491, 0.9993891206405656, 1, 1]\n");
			for(int i = 0; i < squishInputs.length; i++) {
				double output = SquishMethod.closeToBoundaryA(boundaryInputs[i]);
				boundaryOutputs[i] = output;
				bw2.write("\ninput: " + boundaryInputs[i] + "  |  output: " + output);
			}
			bw2.close();
			System.out.println("\tDone running close to boundary function");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Done running sample inputs");
		
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
