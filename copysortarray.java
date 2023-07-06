// copy and sort arrays //

import java.util.Arrays;

public class copysortarray{
	public static void main(String[] args){

		int[] source = {99, 33, 11, 88, 44};
		int[] target = new int[5];

		for(int i = 0; i < source.length; i ++){

			System.out.println("source[" + i + "] " + source[i] + "\t");
			System.out.println("target[" + i + "] " + target[i] + "\t");
			
		}

		//copies array contents//


	System.arraycopy(source, 0, target, 0, source.length);

	System.out.println("\n\tAfter copy\n");
	for(int i = 0; i < source.length; i ++){

		System.out.println("source[" + i + "] " + source[i] + "\t");
		System.out.println("target[" + i + "] " + target[i] + "\t");
	}

	for(int i = 0; i < source.length; i ++){
		
		//change soulrce array value//

	source[i] = (int)(Math.random() * 100 + 1);
	}
	
	System.out.println("\n\tAfter changes to original array\n");

	for(int i = 0; i < source.length; i ++){

		System.out.println("source[" + i + "] " + source[i] + "\t");
		//copied array stay the same//

		System.out.println("target[" + i + "] " + target[i] + "\t");
	}

	//sort arrays

	Arrays.sort(source);
	Arrays.sort(target);

	System.out.println("\n\tAfter sort\n");

	for(int i = 0; i < source.length; i ++){
		System.out.println("source[" + i + "] " + source[i] + "\t");
		System.out.println("target[" + i + "] " + target[i] + "\t");	
		}
	}
}