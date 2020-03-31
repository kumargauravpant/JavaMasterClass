package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(0,5,4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        // bigCount: 5 kg each
        // smallCount: 1 kg each
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        for ( int i=1; i<=bigCount; i++){

            if (goal >= 5){
                goal -= 5;
            } else
                break;
            System.out.println("big:" + goal);
        }

 /*       for ( int i=1; i<=smallCount; i++){

            if (goal >= 1){
                goal -= 1;
            } else
                break;
            System.out.println("small:" + goal);
        }

        if (goal == 0) {
            return true;
        } else
            return false;*/

        if (goal <= smallCount || goal == 0) {

            return true;
        } else
            return false;
    }
}
