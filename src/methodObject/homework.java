package methodObject;

import jdk.internal.org.objectweb.asm.Type;

import java.sql.SQLOutput;

public class homework {


    public static void main(String[] args) {
        Author levTolstoi = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и Мир", 1867, levTolstoi);
        System.out.println(warAndPeace);

        Book crimeAndPunishment = new Book();
        crimeAndPunishment.setName("Преступление и наказание.");
        System.out.print("Название книги: " + crimeAndPunishment.getName());
        crimeAndPunishment.setDateOfWriting(1866);
        System.out.print(" Год издания: " + crimeAndPunishment.getDateOfWriting());
        Author Fedor = new Author("Федор", "Достоевский.");
        crimeAndPunishment.setAuthor(Fedor);
        System.out.println(". Автор книги: " + crimeAndPunishment.getAuthor());

        System.out.println(Fedor.hashCode());
        System.out.println(levTolstoi.equals(Fedor));
    }
}

