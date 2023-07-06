/* Command line arguments 

When executed with the following 
java CommandLine1 arg 1 "arg2" "arg3" arg4

the following will be printed 
arg1
arg2 arg3
arg4
*/

public class Args{
	public static void main(String [] args){
		if(args.length > 0){
			for(int i = 0; i < args.length; ++i){
				System.out.println("args[" + i + "] has a value of " + args[i]);

			}
		}
		else{
			System.out.println("No Command-line arguments were provided.");
		}
	}
}