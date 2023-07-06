/* The enhanced for statement may only be used to use array elements. 
The enhanced for statement may not be used to modify elements. 
*/

public class Enhancedforloop{
	public static void main(String [] args){
		int [] iArray = null;
		double [] dArray = null;

		iArray = new int [3];
		dArray = new double [3];

		iArray[0] = 1;
		iArray[1] = 2;
		iArray[2] = 3;


		dArray[0] = 222.333;
		dArray[1] = 444.555;
		dArray[2] = 777.888;

		/* This cannot be used to modify elements */

/*		for(int i : iArray){
			i = 99;
		}

		/* This cannot be used to modify elements */

		for(double d : dArray){
			d = 99.99;
		}

		for(int i : iArray){
			System.out.println("iArray[" + i + "] = " + i);
		}
		System.out.println();

		for(double d : dArray){
			System.out.println("dArray[" + d + "] = " + d);
		}
	}
}


/* Using array values as array subscripts watch the boundaries */

public class Enhancedforloop{
	public static void main(String [] args){
		int [] intArray = {1,2,3,4,5};
		int [] subScripts = {3,1,0,4,2};

		for(int i = 0; i < intArray.length; ++ i){
			System.out.println("intArray[subScripts[" + i + "]]" + intArray[subScripts[i]]);
		}
	}