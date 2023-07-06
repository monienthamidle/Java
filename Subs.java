/* Using array values as array subscripts watch the boundaries */

public class Subs{
	public static void main(String [] args){
		int [] intArray = {1,2,3,4,5};
		int [] subScripts = {3,1,0,4,2};

		for(int i = 0; i < intArray.length; ++ i){
			System.out.println("intArray[subScripts[" + i + "]]" + intArray[subScripts[i]]);
		}
	}
}