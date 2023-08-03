import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Main {
    public static void main(String[] args) {
        Author a1=new Author("a001","kumarathunga ");
        Book b1=new Book("b001","Magulkama",a1);

        b1.setAuthor(a1);

        Session session= FactoryConfiguration.getInstance().getSession();

        Transaction transaction= session.beginTransaction();
        session.persist(a1);
        session.persist(b1);
        transaction.commit();
        session.close();
    }
}
