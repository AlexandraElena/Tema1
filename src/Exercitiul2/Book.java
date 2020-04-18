package Exercitiul2;

import javax.lang.model.element.TypeElement;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Book {

    enum Type  {
        LITERATURA_CLASICA, THRILLER, Psychology, MANUAL, Self_Improvement;

    }

    String name;
    String author;
    Type type;
    Double price;

    public Book(String name, String author, Type type, Double price) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.price = price;
    }

    @Override
   public String toString() {
        return "\n"+"tip "+ type + " , "+ "Nume carte: " +  this.name +" , " +  " pret:  "+  this.price+ ", " +"autor: " + this.author ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) &&
                Objects.equals(author, book.author);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }

    public static void main(String[] args) {
        HashSet<Book> books = new HashSet<>();
        books.add(new Book("Baltagul","Mihail Sadoveanu",Type.LITERATURA_CLASICA,15.9));
        books.add(new Book("Morometii","Marin Preda", Type.LITERATURA_CLASICA,15.9));
        books.add(new Book("Dezvoltarea personalitatii","Popescu Ion", Type.Self_Improvement,10.9));
        books.add(new Book("Increderea","Popescu Ion", Type.Self_Improvement,12.9));
        books.add(new Book("Ucigasul ABC","Agatha Christie", Type.THRILLER,22.9));
        books.add(new Book("Sabia","Emil Pacoste", Type.THRILLER,11.9));
        books.add(new Book("In mintea ta","Faur Iulian", Type.Psychology,9.99));
        books.add(new Book("Creierul","Ardeleanu Mihai",Type.Psychology,7.99));
        books.add(new Book("Abecedar","Costescu Mihai", Type.MANUAL,30.9));
        books.add(new Book("Matematica","Matei Dorin", Type.MANUAL,15.9));

        books.stream().filter(b -> b.type ==Book.Type.LITERATURA_CLASICA).forEach(b -> System.out.println(b));


        System.out.println("==================================");


        books.removeIf(book -> book.type==Type.THRILLER);
        books.stream().filter(b -> b.type== Type.MANUAL).forEach(b ->b.price*=0.9);

        System.out.println(books);

        }

    }



















