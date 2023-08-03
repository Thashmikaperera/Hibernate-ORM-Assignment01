import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryCofigaration;

public class Main {
    public static void main(String[] args) {
        Author author=new Author();
        author.setId("a001");
        author.setName("Kumarathunga");

        author.setId("a001");
        author.setName("Magulkama");

        Book book=new Book();
        book.setId("b001");
        book.setName("Hathpana");
        book.setAuthor(author);

        Session session= FactoryCofigaration.getInstance().getSession();

        Transaction transaction= session.beginTransaction();

        session.persist(author);
        session.persist(book);

        transaction.commit();
        session.close();
    }
}
