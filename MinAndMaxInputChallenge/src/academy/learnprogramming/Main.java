package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

//        int minNumber = 0;
//        int maxNumber = 0;
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
//        boolean first = true;
        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.println("Enter Number:");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

/*                if(first){
                    first = false;
                    minNumber = number;
                    maxNumber = number;
                }*/

                if (number > maxNumber){
                    maxNumber = number;
                }
                if (number < minNumber)  {
                    minNumber = number;
                }
            } else {
                System.out.println("Min Number: " + minNumber);
                System.out.println("Max Number: " + maxNumber);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        }

    public static void inputThenPrintSumAndAverage() {

        int sum = 0;
        double avg = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while(true) {

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                count++;
                sum += scanner.nextInt();
                avg =  ((double) sum)/count;
                System.out.println("###" + count + "####" + sum + "###" + avg);
            } else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
    }
}


