import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.FactoryConfiguration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session= FactoryConfiguration.getInstance().getSession();

        Transaction transaction= session.beginTransaction();

        Book b1= new Book();
        b1.setId("b001");
        b1.setName("Hathpana");

        Author a1=new Author();
        a1.setId("a001");
        a1.setName("Kumarathunga");

        List<Book> bookList=new ArrayList<>();
        bookList.add(b1);
        List<Author> authorList=new ArrayList<>();
        authorList.add(a1);

        b1.setAuthors(authorList);
        a1.setBooks(bookList);

        session.persist(b1);
        session.persist(a1);

        transaction.commit();
        session.close();
    }
}
