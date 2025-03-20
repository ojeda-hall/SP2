public class PrintedBook extends Title {
    private int pages;

    public PrintedBook(String literatureType, int copies, int pages) {
        super(literatureType, copies);
        this.pages = pages;
    }

    protected double calculatePoints() {
        return (double)this.pages * this.calculateLiteraturePoints() * (double)this.copies;
    }
}