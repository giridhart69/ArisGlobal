import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class StoreData
{
	public static void main(String[] args)  
    {
		System.out.println("Project started");
		Configuration cfg=new Configuration();
		SessionFactory f=cfg.buildSessionFactory();
		System.out.println(f);
		System.out.println(f.isClosed());
	}  
}