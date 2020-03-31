package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        for (int i=10; i<50; i++){
            if (isPrimeNumber(i)){
                System.out.println(i);
                count++;
            }
            if (count == 3){
                break;
            }
        }

        // Another challenge
        count = 0;
        int sum = 0;
        for (int i=1; i<=1000; i++){
            if ( i % 3 == 0 && i % 5 == 0){
                System.out.println("The Number divisible by 3 and 5 is : " + i);
                sum += i;
                count++;
                if (count == 5)
                    break;
            }
        }
        System.out.println("The sum is: " + sum);
    }

    public static boolean isPrimeNumber(int number){

        if (number <= 1){
            return false;
        }

        for (int i=2; i <= number/2; i++){

            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
