package test1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Project started");
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory f=cfg.buildSessionFactory();
        student s=new student();
        s.setId(2);
        s.setName("Harshavardhan");
        s.setCity("Hyderabad");
        System.out.println(s);
        Session se=f.openSession();
        org.hibernate.Transaction tx=se.beginTransaction();
        se.save(s);
        tx.commit();
        se.close();
    }
}