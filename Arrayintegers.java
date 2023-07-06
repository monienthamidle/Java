//module 9 assignment 


import java.util.*;   
public class Arrayintegers{
    public static void main(String[] args){
        
        int[] array;      
        array = new int[20];  
        Scanner s = new Scanner(System.in);  
        System.out.println("Enter 20 elements:");  
        for (int i = 0; i < array.length; i++){
            
            array[i]=s.nextInt();    
    }
     int min = array[0];    //declare min var
     int max = array[0];    //declar max var
     int sum = 0;    //declare sum var 

  for (int i = 0; i < array.length; i++){
   
    sum += array[i];    
   if (array[i] > max){
   
    max = array[i];
   }
   else if (array[i] < min){
    min = array[i];
    }
  }
  float avg = sum/array.length;    
  System.out.println("The highest number is : " + max);
  System.out.println("The lowest number is : " + min);
  System.out.println("The average of the numbers entered is : " + avg);
  System.out.println("The sum of the numbers entered is : " + sum);
  
    }
}