import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfigaration;

public class Main {
    public static void main(String[] args) {
        Book b1=new Book("b001","Magulkama");
        Book b2=new Book("b002","Hathpana");
        Session session= FactoryConfigaration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();
        session.persist(b1);
        session.persist(b2);
        transaction.commit();
        Transaction transaction1= session.beginTransaction();
        Book b001 = session.get(Book.class, "b001");
        transaction1.commit();

        Transaction transaction2= session.beginTransaction();
        if (b001 != null){
            b001.setName("baddegama");
            transaction2.commit();
        }

        Transaction transaction3= session.beginTransaction();
        session.remove(b001);
        transaction3.commit();
    }
}
