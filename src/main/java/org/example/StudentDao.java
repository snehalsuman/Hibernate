package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentDao {
    SessionFactory sf =HibernateUtil.getSessionFactory();

    public void saveAStudent(Student s)
    {
        Session s1 =sf.openSession();
        Transaction t1=s1.beginTransaction();
        s1.persist(s);
        t1.commit();
        System.out.println("Student Object Saved!!!!");
        s1.close();


    }
    public void deleteAStudet(int id)
    {
        Session s2 = sf.openSession();
        Transaction t2 = s2.beginTransaction();
        Student s = s2.get(Student.class,id);
        if(s!=null) {
            s2.delete(s);
            t2.commit();
            System.out.println("Object Deleted!!!");
        }
        else
            System.out.println("Object does not exist!!!!");
        s2.close();


    }
    public Student findById(int id){
        Session s3=sf.openSession();
        Transaction t4=s3.beginTransaction();
        Student s=s3.get(Student.class,id);
        t4.commit();
        s3.close();
        return s;
    }

    public void UpdateStudent(int id,Student s)
    {
        Session s4=sf.openSession();
        Transaction t5=s4.beginTransaction();
        Student s1=s4.get(Student.class,id);
        s1.setEmail(s.getEmail());
        s4.merge(s1);
        t5.commit();
        System.out.println("");
        s4.close();
    }





}
