package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    public static final SessionFactory sessionFactory = buildSessionfactory();
    public static SessionFactory buildSessionfactory()
    {
        Configuration config =new Configuration();
        config.configure();

        return config.buildSessionFactory();

    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
    public static void shutdown()
    {
        sessionFactory.close();
    }



}
