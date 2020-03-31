package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum of the digits: " + sumDigit(456));

        int num = 456; int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }

        System.out.println("new sum is " + sum);
    }

    public static int sumDigit(int number){

        int sum = 0;
        if ( number < 10 ){
            return -1;
        }
        System.out.println("the number is: " + number);
        do {
            sum += number % 10;
            number /= 10;
        } while (number > 0);
        return sum;
    }
}
