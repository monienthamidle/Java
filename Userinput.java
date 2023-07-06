/*search for user input*/ 

import javax.swing.*;

public class Userinput{
	public static void main(String [] args){
		String input = null;
		int itemToLookfor = 0;
		boolean found = false;

		int [] itemNumbers = {2, 4, 6, 8, 10};

		input = JOptionPane.showInputDialog(null, "Enter the item number you want the prices for:");

		itemToLookfor = Integer.parseInt(input);

		for(int i = 0; i < itemNumbers.length; ++ i){

			if(itemToLookfor == itemNumbers[i]){
				found = true;
			}
		}
	if(found){
		System.out.println(" **** Your item has been found. **** ");
	}
	else{
		System.out.println(" ---- Your item has not been found. ---- ");
		}
	}

}