import java.util.*;
import java.sql.*;
class details
{
	private int authorid;
	private String firstname;
	private String middlename;
	private String lastname;
	private long phone;
	public int getAuthorid()
	{
		return authorid;
	}
	public void setAuthorid(int authorid)
	{
		this.authorid = authorid;
	}
	public String getFirstname()
	{
		return firstname;
	}
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	public String getMiddlename()
	{
		return middlename;
	}
	public void setMiddlename(String middlename)
	{
		this.middlename = middlename;
	}
	public String getLastname()
	{
		return lastname;
	}
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	public long getPhone()
	{
		return phone;
	}
	public void setPhone(long phone)
	{
		this.phone = phone;
	}
}
public class a2
{
	Scanner sc=new Scanner(System.in);
	Statement s;
	Connection con;
	ResultSet r;
	public void insert()
	{
		details d=new details();
		System.out.println("Enter authorid: ");
		int i=sc.nextInt();
		sc.nextLine();
		d.setAuthorid(i);
		
		System.out.println("Enter First Name: ");
		String jx=sc.nextLine();
		d.setFirstname(jx);
		
		System.out.println("Enter Middle Name: ");
		String k=sc.nextLine();
		d.setMiddlename(k);
		
		System.out.println("Enter Last Name: ");
		String l=sc.nextLine();
		d.setLastname(l);
		
		System.out.println("Enter Phone Number: ");
		long m=sc.nextLong();
		d.setPhone(m);
		
		try
		{
			con=getconnect();
			PreparedStatement pst=con.prepareStatement("insert into author(authorid,firstname,middlename,lastname,phone)values(?,?,?,?,?)");
			pst.setInt(1, d.getAuthorid());
			pst.setString(2, d.getFirstname());
			pst.setString(3, d.getMiddlename());
			pst.setString(4, d.getLastname());
			pst.setLong(5, d.getPhone());
			int x=pst.executeUpdate();
			pst.close();
			con.close();
			if(x==1)
			{
				System.out.println("Records inserted !");
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	public void display()
	{
		try
		{
			con=getconnect();
			PreparedStatement pst=con.prepareStatement("select * from author");
			r=pst.executeQuery();
			while(r.next())
			{
				System.out.println(r.getInt(1)+"\t"+r.getString(2)+"\t"+r.getString(3)+"\t"+r.getString(4)+"\t"+r.getInt(5));
			}
			r.close();
			pst.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void update()
	{
		details d=new details();
		System.out.println("Enter authorid: ");
		int i=sc.nextInt();
		sc.nextLine();
		d.setAuthorid(i);
		
		System.out.println("Enter First Name: ");
		String jx=sc.nextLine();
		d.setFirstname(jx);
		
		System.out.println("Enter Middle Name: ");
		String k=sc.nextLine();
		d.setMiddlename(k);
		
		System.out.println("Enter Last Name: ");
		String l=sc.nextLine();
		d.setLastname(l);
		
		System.out.println("Enter Phone Number: ");
		long m=sc.nextLong();
		d.setPhone(m);
		
		try
		{
			Connection con=getconnect();
			String we="update author set authorid=?,firstname=?,middlename=?,lastname=?,phone=? where authorid=?";
			PreparedStatement pst=con.prepareStatement(we);
			pst.setInt(1, d.getAuthorid());
			pst.setString(2, d.getFirstname());
			pst.setString(3, d.getMiddlename());
			pst.setString(4, d.getLastname());
			pst.setLong(5, d.getPhone());
			pst.setLong(6, d.getAuthorid());
			int x=pst.executeUpdate();
			pst.close();
			con.close();
			if(x==1)
			{
				System.out.println("Records Updated !");
			}
			else
			{
				System.out.println("Records not found !");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void delete()
	{
		try
		{
			String naem;
			System.out.println("Enter authorid to delete:");
			naem=sc.next();
			Connection con=getconnect();
			PreparedStatement pst=con.prepareStatement("delete from author where authorid=?");
			pst.setString(1,naem);
			int x=pst.executeUpdate();
			if(x==1)
			{
				System.out.println("Record deleted !");
			}
			else
			{
				System.out.println("Record not found !");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void custom()
	{
		
		try
		{
			String naem;
			System.out.println("Enter authorid to display:");
			naem=sc.next();
			Connection con=getconnect();
			PreparedStatement pst=con.prepareStatement("select * from author where authorid=?");
			pst.setString(1,naem);
			r=pst.executeQuery();
			while(r.next())
			{
				System.out.println(r.getInt(1)+"\t"+r.getString(2)+"\t"+r.getString(3)+"\t"+r.getString(4)+"\t"+r.getInt(5));
			}
			r.close();
			pst.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public Connection getconnect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gyro","root","");
			return con;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args)
	{
		a2 e=new a2();
		Scanner sc=new Scanner(System.in);
		char ch = 0;
		while(true)
		{
		System.out.println("Enter your choice: ");
		System.out.println("1.Insert values into table: ");
		System.out.println("2.Display table: ");
		System.out.println("3.Update table: ");
		System.out.println("4.Delete records in table: ");
		System.out.println("5.exit ");
		System.out.println("6.Custom ");
		ch=sc.next().charAt(0);
		switch(ch)
		{
		case('1'):
			e.insert();
			break;
		case('2'):
			e.display();
			break;
		case('3'):
			e.update();
			break;
		case('4'):
			e.delete();
			break;
		case('5'):
			System.out.println("Program exit !");
			sc.close();
			System.exit(0);
		case('6'):
			e.custom();
			break;
		default:
			break;
		}
		}
	}
}