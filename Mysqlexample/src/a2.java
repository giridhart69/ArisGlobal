import java.util.*;
import java.sql.*;
class details
{
	private String name;
	private String designation;
	private String city;
	private String state;
	private String country;
	private int slno;
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getDesignation()
	{
		return designation;
	}
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public String getCountry()
	{
		return country;
	}
	public void setCountry(String country)
	{
		this.country = country;
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
		System.out.println("Enter name: ");
		String i=sc.nextLine();
		d.setName(i);
		
		System.out.println("Enter Designation: ");
		String j=sc.nextLine();
		d.setDesignation(j);
		
		System.out.println("Enter City: ");
		String k=sc.nextLine();
		d.setCity(k);
		
		System.out.println("Enter State: ");
		String l=sc.nextLine();
		d.setState(l);
		
		System.out.println("Enter Country: ");
		String m=sc.nextLine();
		d.setCountry(m);
		
		try
		{
			con=getconnect();
			PreparedStatement pst=con.prepareStatement("insert into emp(ename,designation,city,state,country) values(?,?,?,?,?)");
			pst.setString(1, d.getName());
			pst.setString(2, d.getDesignation());
			pst.setString(3, d.getCity());
			pst.setString(4, d.getState());
			pst.setString(5, d.getCountry());
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
			PreparedStatement pst=con.prepareStatement("select * from emp");
			r=pst.executeQuery();
			while(r.next())
			{
				System.out.println(r.getString(1)+"\t"+r.getString(2)+"\t"+r.getString(3)+"\t"+r.getString(4)+"\t"+r.getString(5)+"\t"+r.getInt(6));
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
		System.out.println("Enter name: ");
		String i=sc.nextLine();
		d.setName(i);
		
		System.out.println("Enter Designation: ");
		String j=sc.nextLine();
		d.setDesignation(j);
		
		System.out.println("Enter City: ");
		String k=sc.nextLine();
		d.setCity(k);
		
		System.out.println("Enter State: ");
		String l=sc.nextLine();
		d.setState(l);
		
		System.out.println("Enter Country: ");
		String m=sc.nextLine();
		d.setCountry(m);
		
		System.out.println("Enter Staff Level Number: ");
		int n=sc.nextInt();
		d.setSlno(n);
		
		try
		{
			Connection con=getconnect();
			String we="update emp set ename=?,designation=?,city=?,state=?,country=? where slno=?";
			PreparedStatement pst=con.prepareStatement(we);
			pst.setString(1, d.getName());
			pst.setString(2, d.getDesignation());
			pst.setString(3, d.getCity());
			pst.setString(4, d.getState());
			pst.setString(5, d.getCountry());
			pst.setInt(6, d.getSlno());
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
			System.out.println("Enter Employee slno to delete:");
			naem=sc.nextLine();
			Connection con=getconnect();
			PreparedStatement pst=con.prepareStatement("delete from emp where slno=?");
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
		default:
			break;
		}
		}
	}
}