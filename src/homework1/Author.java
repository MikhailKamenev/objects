package homework1;

import java.util.Objects;

public class Author {
    private String firstName;
    private String familyName;

    public Author(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getFullName() {
        return firstName+familyName;
    }

    @Override
    public String toString() {
        return firstName +
                " " + familyName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author that = (Author) other;
        return getFullName().equals(that.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getFamilyName());
    }
}
