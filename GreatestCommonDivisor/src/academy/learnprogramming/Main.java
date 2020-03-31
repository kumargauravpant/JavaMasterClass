package academy.learnprogramming;

public class Main {

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10){

            return -1;
        }

        int number = first > second ? second : first;
        int div = 0;

        for (int i=number; i <= number; i--) {
            System.out.println("before if : " + i);
            if (first % i == 0 && second % i == 0) {
                System.out.println("inside if : " + i);
                div = i;
                break;
            }
        }
        return div;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
    }
}
