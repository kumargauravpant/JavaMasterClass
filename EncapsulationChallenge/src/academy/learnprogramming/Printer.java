package academy.learnprogramming;

public class Printer {

    private int tonerLevel = 100;
    private int pagePrinted;
    private boolean isDuplexPrinter;

    private final int LINES_PER_PAGE = 30;
    private final int LINES_PER_PAGE_DUPLEX = 60;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagePrinted() {
        return pagePrinted;
    }

    public void fillToner(int level){
        if (level > 0) {
            this.tonerLevel += level;
        }
        if (this.tonerLevel > 100) {
            this.tonerLevel = 100;
        }
        System.out.println("Refilled Toner");
    }

    public void printPages(int lines) {
        if (isDuplexPrinter){
            this.pagePrinted = (int) Math.ceil(lines/LINES_PER_PAGE_DUPLEX);
        } else {
            this.pagePrinted = (int) Math.ceil(lines/LINES_PER_PAGE);
        }

        this.tonerLevel -= this.pagePrinted;
    }
}
