package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

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
        StudentDao sd = null;
        try {
            sd = new StudentDao();

            byte image[] = Files.readAllBytes(Paths.get("src/main/resources/img.png"));
            Student s = new Student("ABC", "CSF304", "b@gmail.com", image);
            sd.saveAStudent(s);

            System.out.println("OBJCET STORED!!!");
        } catch (Exception e) {
            System.out.println("Some error!!!!");
        }

//        Student s = sd.findById(1);
//        byte image[] = s.getImage();
//
//        Path path = Paths.get("scr/main/resources/output.jpg");
//        try {
//            Files.write(path, image);
//        } catch (Exception e) {
//            System.out.println("Some error!!!");
//        }
    }
}

//        Student s1 =new Student("CDE","CSF305","cd@gmail.com",12);


//        sd.saveAStudent(s1);

//        sd.deleteAStudet(s.getRoll());
//
//        s1.setEmail("s1@gmail.com");
//        sd.UpdateStudent(s1.getRoll(),s1);
//
//        System.out.println(sd.findById(s1.getRoll()));
//    }


