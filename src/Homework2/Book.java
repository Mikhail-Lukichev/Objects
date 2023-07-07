package Homework2;

public class Book {
    private String name;
    private Author author;
    private int publishingYear;
    public Book (String name, Author author, int publishingYear) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public String getName() {
        return this.name;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public Author getAuthor(){
        return this.author;
    }
    public void setPublishingYear(int year) {
        this.publishingYear = year;
    }
    public String toString() {
        return "Book name: " + name + "; Author: " + author.toString();
    }
    public Boolean equals(Book other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book otherObject = (Book) other;
        return this.name.equals(otherObject.name) && this.author.toString().equals(otherObject.author.toString());
    }
    public int hashCode() {
        return java.util.Objects.hash(name + author.toString());
    }

}
