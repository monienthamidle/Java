/* Adding command line integers 
int parseInt(String)
This code may cause a problem we will learn more how to deal with in a later course. 

*/


public class Argsint{
	public static void main(String []args){
		int total = 0;
		if(args.length > 0){
			for(int i = 0; i < args.length; ++ i){
				total += Integer.parseInt(args[i]);
			}
			System.out.println(total);
		}
		else{
			System.out.println("No Command-line arguments were provided.");
		}

	}
}