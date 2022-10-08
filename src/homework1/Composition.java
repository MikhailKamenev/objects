package homework1;

import java.util.Objects;

public class Composition {
    private String name;
    private Author author;
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

    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Composition {" + name +
                ", author - " + author.toString() +
                ", year - " + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Composition that = (Composition) o;
        return getYear() == that.getYear() && Objects.equals(getName(), that.getName()) && Objects.equals(getAuthor(), that.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), author, getYear());
    }
}
