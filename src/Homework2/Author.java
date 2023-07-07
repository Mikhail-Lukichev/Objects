package Homework2;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String toString() {
        return firstName + " " + lastName;
    }
    public boolean equals(Author other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author otherObject = (Author) other;
        return this.firstName.equals(otherObject.firstName) && this.lastName.equals(otherObject.lastName);
    }
    public int hashCode() {
        return java.util.Objects.hash(firstName + lastName);
    }
}
