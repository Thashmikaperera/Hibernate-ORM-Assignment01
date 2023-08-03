package util;

import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryCofigaration {
    private static FactoryCofigaration factoryConfriguration;
    private SessionFactory sessionFactory;

    private FactoryCofigaration() {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(Book.class);
        configuration.addAnnotatedClass(Author.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryCofigaration getInstance() {
        return (factoryConfriguration == null) ?
                factoryConfriguration = new FactoryCofigaration() : factoryConfriguration;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}
