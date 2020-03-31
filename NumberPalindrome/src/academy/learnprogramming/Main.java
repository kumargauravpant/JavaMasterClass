package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int newNumber = number;
        while ( newNumber != 0){
            reverse *= 10;
            reverse += newNumber % 10;
            newNumber /= 10;
        }

        System.out.println(reverse);
        if (reverse == number) {
            return true;
        } else {
            return false;
        }
    }
}
