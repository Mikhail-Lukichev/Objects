package Homework1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Author leoTolstoy = new Author("Leo","Tolstoy");
        Author fyodorDostoevsky = new Author("Fyodor","Dostoevsky");
        Book warAndPeace = new Book("War And Peace",leoTolstoy,1869);
        Book crimeAndPunishment = new Book("Crime And Punishment",fyodorDostoevsky,1866);
        System.out.println("warAndPeace.getPublishingYear() = " + warAndPeace.getPublishingYear());
        warAndPeace.setPublishingYear(1870);
        System.out.println("warAndPeace.getPublishingYear() = " + warAndPeace.getPublishingYear());
    }
}
