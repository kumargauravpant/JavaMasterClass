package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        char switchValue = 'A';
        switch (switchValue){

            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("is C or D or E");
                break;
            default:
                System.out.println("Not Found");
                break;
        }
    }
}
