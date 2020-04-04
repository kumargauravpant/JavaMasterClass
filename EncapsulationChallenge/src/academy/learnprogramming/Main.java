package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Printer myPrinter = new Printer(50,false);
        System.out.println("Toner level is " + myPrinter.getTonerLevel());

        myPrinter.printPages(1000);
        System.out.println("Pages printed are " + myPrinter.getPagePrinted());
        System.out.println("Toner level is " + myPrinter.getTonerLevel());

        myPrinter.fillToner(20);
        System.out.println("Toner level is " + myPrinter.getTonerLevel());

        myPrinter.fillToner(200);
        System.out.println("Toner level is " + myPrinter.getTonerLevel());
    }
}
