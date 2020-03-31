package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //getLargestPrime(64);
        System.out.println(getLargestPrimeFactor(63));
    }

    public static void getLargestPrime(int number){

        boolean isPrime = true;
        int num = -1;
        for (int i=2; i<=number; i++){

            if (number % i == 0){
                //System.out.println(i);
                for (int j=2; j<i; j++){

                    if (i % j == 0) {
                        isPrime = false;
                    }
                } if(isPrime) num = i;
            }
        }
        System.out.println("####" + num);
    }

    public static int getLargestPrimeFactor(int number){
        if(number < 0)
            return -1;

        int largestPrimeFactor = -1;
        for(int i = 2; i <= number; i++){
            if(number == 1 || number < largestPrimeFactor){
                break;
            }
            System.out.println("################" + i);
            while(number % i == 0){
                number /= i;
                System.out.println(number);
                System.out.println(i);
                System.out.println("#################");
                largestPrimeFactor = i;
            }
        }
        return largestPrimeFactor;
    }
}
