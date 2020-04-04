package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] myIntArray = getIntegers(5);
	    //printArray(myIntArray);
        //System.out.println();
	    //int[] sortedArray = sortIntegers(myIntArray);
	    //printArray(sortedArray);
        //System.out.println();

        //System.out.println("min value is: " + findMin(myIntArray));
        //System.out.println();
        reverse(myIntArray);

        reverseArray(myIntArray);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " numbers:" + '\r');
        int[] inputArray = new int[number];
        for (int i=0; i<inputArray.length;i++) {
            inputArray[i] = scanner.nextInt();
        }
        scanner.close();
        return inputArray;
    }

    public static void printArray(int[] array) {
        for (int i=0;i<array.length;i++) {
            System.out.println("array element " + i + " is :" + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int num = array[i];
                    array[i] = array[j];
                    array[j] = num;
                }
            }
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static void reverse(int[] array) {
        System.out.println("input array: " + Arrays.toString(array));
        int[] reversedArray = new int[array.length];

        for (int i=array.length-1; i>=0; i--) {
            int index = (reversedArray.length -1) - i;
            reversedArray[index] = array[i];
        }

        System.out.println("reversed array : " + Arrays.toString(reversedArray));
    }

    public static void reverseArray(int[] array) {
        System.out.println("input array: " + Arrays.toString(array));
        int maxIndex = array.length - 1;
        for (int i=0; i<array.length/2; i++) {
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex-i] = temp;
        }

        System.out.println("reversed array : " + Arrays.toString(array));
    }

}
