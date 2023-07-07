package Homework2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");

        Author leoTolstoy = new Author("Leo","Tolstoy");
        Author fyodorDostoevsky = new Author("Fyodor","Dostoevsky");
        Author fyodorDostoevskyClone = new Author("Fyodor","Dostoevsky");
        System.out.println(leoTolstoy.toString());
        System.out.println(fyodorDostoevsky.toString());
        System.out.println("leoTolstoy hash is " + leoTolstoy.hashCode());
        System.out.println("Is fyodorDostoevsky equal to leoTolstoy? " + fyodorDostoevsky.equals(leoTolstoy));
        System.out.println("Is fyodorDostoevsky equal to fyodorDostoevskyClone? " + fyodorDostoevsky.equals(fyodorDostoevskyClone));

        System.out.println();

        Book warAndPeace = new Book("War And Peace",leoTolstoy,1869);
        Book warAndPeaceClone = new Book("War And Peace",leoTolstoy,1869);
        Book crimeAndPunishment = new Book("Crime And Punishment",fyodorDostoevsky,1866);
        System.out.println(warAndPeace.toString());
        System.out.println(crimeAndPunishment.toString());
        System.out.println("warAndPeace hash is " + warAndPeace.hashCode());
        System.out.println("Is warAndPeace equal to crimeAndPunishment? " + warAndPeace.equals(crimeAndPunishment));
        System.out.println("Is warAndPeace equal to warAndPeaceClone? " + warAndPeace.equals(warAndPeaceClone));
    }
}
