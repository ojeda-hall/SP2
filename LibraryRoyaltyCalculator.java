public class LibraryRoyaltyCalculator {
    public LibraryRoyaltyCalculator() {
    }

    public static void main(String[] args) {
        Author author = new Author("Olga Ravn");
        author.addTitle(new PrintedBook("TE", 130, 75));
        author.addTitle(new PrintedBook("SKØN", 50, 350));
        author.addTitle(new AudioBook("SKØN", 20, 400));
        double totalPay = author.calculateTotalPay();
        System.out.printf("%s: %.2fkr%n", author.getName(), totalPay);
    }
}
