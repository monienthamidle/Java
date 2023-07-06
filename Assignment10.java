import java.util.*;
class Assignment10 {
    //array short average
    public static short average(short [] array) {
        short s = 0;
        for (int arrIndex = 0; arrIndex < array.length; arrIndex++) {
            s += array[arrIndex];
        }
        return (short) (s / array.length);
    }

    //array in average
    public static int average(int [] array) {
        int s = 0;
        for (int arrIndex = 0; arrIndex < array.length; arrIndex++) {
            s += array[arrIndex];
        }
        return s / array.length;
    }

    //array long average
    public static long average(long [] array) {
        long s = 0;
        for (int arrIndex = 0; arrIndex < array.length; arrIndex++) {
            s += array[arrIndex];
        }
        return s / array.length;
    }

    //array double average 
    public static double average(double [] array) {
        double s = 0;
        for (int arrIndex = 0; arrIndex < array.length; arrIndex++) {
            s += array[arrIndex];
        }
        return s / array.length;
    }

    
    public static void main(String[] args) {
        
        //short array
        short[] s1 = {45, 41, 90, 10, 2};
        System.out.print("Array 1: [");
        for (int arrIndex = 0; arrIndex < s1.length; arrIndex++) {
            System.out.print(s1[arrIndex] + " ");
        }
        System.out.println("]");
        System.out.println("Average of Short Array : " + average(s1));
        
        //average array
        int[] s2 = {24, 28, 75, 45, 50};
        System.out.print("Array 2: [");
        for (int arrIndex = 0; arrIndex < s2.length; arrIndex++) {
            System.out.print(s2[arrIndex] + " ");
        }
        System.out.println("]");
        System.out.println("Average of Int Array : " + average(s2));
        
        //long average array
        long[] s3 = {10, 12, 18, 52, 70};
        System.out.print("Array 3: [");
        for (int arrIndex = 0; arrIndex < s3.length; arrIndex++) {
            System.out.print(s3[arrIndex] + " ");
        }
        System.out.println("]");
        System.out.println("Average of Long Array : " + average(s3));
        
        //double average array
        double[] s4 = {10, 25, 50, 2};
        System.out.print("Array 4: [");
        for (int arrIndex = 0; arrIndex < s4.length; arrIndex++) {
            System.out.print(s4[arrIndex] + " ");
        }
        System.out.println("]");
        System.out.println("Average of Double Array : " + average(s4));
    }
}