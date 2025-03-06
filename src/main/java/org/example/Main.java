package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

//        Configuration cfg = new Configuration();
//        cfg.configure();
//
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//
//        Session session = sessionFactory.openSession();
//
//        Author a1 = new Author("ABC" , 23);
//
//
//        Author a2 = new Author("CDE" , 25);
//        Transaction tx = session.beginTransaction();
//        session.persist(a1);
//        session.persist(a2);
//        tx.commit();
//        session.close();
//        sessionFactory.close();
//
//
//
//
        StudentDao sd =new StudentDao();

        Student s =new Student("ABC","CSF304", "ab@gmail.com", 11);
        sd.saveAStudent(s);

        Student s1 =new Student("CDE","CSF305","cd@gmail.com",12);



        sd.saveAStudent(s1);

        sd.deleteAStudet(s.getRoll());

        s1.setEmail("s1@gmail.com");
        sd.UpdateStudent(s1.getRoll(),s1);

        System.out.println(sd.findById(s1.getRoll()));
    }


}