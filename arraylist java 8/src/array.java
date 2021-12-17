import java.util.*;
import java.util.stream.Collectors;

class persons
{
	String fname,lname;
	int age;
	public String getFname()
	{
		return fname;
	}
	public void setFname(String fname)
	{
		this.fname = fname;
	}
	public String getLname()
	{
		return lname;
	}
	public void setLname(String lname)
	{
		this.lname = lname;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public persons(String fname, String lname, int age)
	{
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	@Override
	public String toString() 
	{
		return "fname=" + fname + ", lname=" + lname + ", age=" + age+"\n";
	}
}
public class array 
{
	/*private static List<String>filter(final Collection<String> source, final String prefix)
	{
	    return source.stream().filter(item -> item.startsWith(prefix)).collect(Collectors.toList());
	}*/
	public static void main(String args[])
	{
		String w="a";
		persons p=new persons("Vijay","Mallya",53);
		persons q=new persons("Ajay","Vishwanath",27);
		persons r=new persons("Yashwanth","Narayan",71);
		persons s=new persons("Sukruth","Iyer",65);
		persons t=new persons("Sylvana","Gotswankzi",42);
		
		List<persons> l=new ArrayList<persons>();
		List<String> re = new ArrayList<String>();
		l.add(p);
		l.add(q);
		l.add(r);
		l.add(s);
		l.add(t);
		System.out.println("Original list !");
		l.forEach(System.out::println);
   }
}