import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList();
    }

    public void addTitle(Title title) {
        this.titles.add(title);
    }

    public double calculateTotalPay() {
        double total = (double)0.0F;

        for(Title title : this.titles) {
            total += title.calculateRoyalties();
        }

        return total;
    }

    public String getName() {
        return this.name;
    }
}

