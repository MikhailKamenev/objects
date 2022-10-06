package homework1;

public class Composition {
    private String name;
    Author author;
    private int year;

    public Composition(String name, Author author, int year) {
        this.name=name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
