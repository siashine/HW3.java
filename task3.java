import java.util.Arrays;

public class task3 {
    private static int nextId = 1;
    private final int id = nextId++;
    private final String name;
    private final String[] authors;
    private final int year;
    private final int pages;
    private int price;

    public task3(String name, String[] authors, int year, int pages, int price) {
        this.name = name;
        this.authors = authors;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getAuthors() {
        return (String[]) authors.clone();
    }


    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "task3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", year=" + year +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }
}