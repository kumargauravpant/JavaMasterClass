package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int startNumber = 4;
        int finishNumber = 20;

        while ( startNumber <= finishNumber){

            if (isEvenNumber(startNumber)){
                System.out.println(startNumber);
            }
            startNumber++;
        }

        System.out.println("*************************");

        startNumber = 4;

        for (int i=startNumber; i<=finishNumber; i++) {

            if (isEvenNumber(i)){
                System.out.println(i);
            }
        }

        System.out.println("*************************");

        startNumber = 4;

        do{
            if (isEvenNumber(startNumber)){
                System.out.println(startNumber);
            }
            startNumber++;
        }while ( startNumber <= finishNumber);
    }


    public static boolean isEvenNumber(int number){

        if (number > 0 && number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
