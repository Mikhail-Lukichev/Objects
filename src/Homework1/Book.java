package Homework1;

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

}
