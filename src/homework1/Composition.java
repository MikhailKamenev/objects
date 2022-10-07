package homework1;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Composition {" + name +
                ", author - " + author.toString() +
                ", year - " + year +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Composition that = (Composition) other;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), author, getYear());
    }
}
