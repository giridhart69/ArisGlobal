package test;
import java.io.*;
import java.lang.*;
import java.util.*;
/*public class a implements Comparable<a>
{
	private String brand;
	private int price;
	public a(String brand,int price)
	{
		super();
		this.brand=brand;
		this.price=price;
	}
	
	public String getBrand()
	{
		return brand;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}
	public int compareTo(a compare)
	{
		int compareprice = ((a) compare).getPrice(); 
		return this.price-compareprice;
	}
	public static void main(String[] args)
	{
		a[] pen=new a[4];
		a b=new a("Reynolds",10);
		a c=new a("Octane",50);
		a d=new a("Natraj",70);
		a e=new a("Camlin",5);
		pen[0]=b;
		pen[1]=c;
		pen[2]=d;
		pen[3]=e;
		
		Arrays.sort(pen);
		for(a r:pen)
		{
			System.out.println("Brand name:"+r.getBrand()+"   "+"Price:"+r.getPrice());
		}
	}
}*/
//comparable USE
/*class ad implements Comparable<ad>
{
	private String brand;
	private int price;
	public ad(String brand,int price)
	{
		super();
		this.brand=brand;
		this.price=price;
	}
	public String toString()
	{
		return "Brand name: "+brand+" "+"Pricing: "+price+"\n";
	}
	public int compareTo(ad o)
	{
		if(this.price==o.price)
		{
			return 0;
		}
		else if(this.price>o.price)
		{
			return 1;

		}
		else
		{
			return -1;

		}
	}
}
public class a
{
	public static void main(String[] args)
	{
		List<ad> ax=new ArrayList<ad>();
		ad w=new ad("Reynolds",10);
		ad x=new ad("Octane",70);
		ad y=new ad("Natraj",50);
		ad z=new ad("Bosch",20);
		ax.add(w);
		ax.add(x);
		ax.add(y);
		ax.add(z);
		Collections.sort(ax);
		System.out.println(ax);
	}
}*/
//comparator USE
/*class PriceComparator implements Comparator<Pen>
{

	@Override
	public int compare(Pen o1, Pen o2)
	{
		if(o1.getPrice()==o2.getPrice())
		return 0;
		else if(o1.getPrice()>=o2.getPrice())
			return 1;
		else return -1;
	}
	 
}
class BrandComparator implements Comparator<Pen>
{
	@Override
	public int compare(Pen o1, Pen o2)
	{
		// TODO Auto-generated method stub
		
		return o1.getBrand().compareTo(o2.getBrand());
	}
	 
}
class Pen implements Comparable<Pen>
{	
	private String brand;
	private double price;
	public Pen(int price,String brand) 
	{
		 this.price=price;
		 this.brand=brand;
	}
	public String toString()
	{
		return "Brand=" + brand + ", Price=" + price +"\n";
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public String getBrand() 
	{
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public int compareTo(Pen o) {
		// TODO Auto-generated method stub
		//if(this.price>o.price)
			//return 1;
		//else if(this.price==o.price)
			//return 0;
		//else return -1;
		return this.brand.compareTo(o.brand);
	}
	 
}
public class a
{	public static void main(String[] args) 
	{
		Pen a=new Pen(2000,"Parker");
		Pen b=new Pen(2009,"Hero");
		Pen c=new Pen(1999,"Trimax");
		List<Pen> x=new ArrayList<Pen>();
		x.add(a);
		x.add(b);
		x.add(c);
		Collections.sort(x,new BrandComparator());
		System.out.println(x);
   }
}*/
//array to accept and print different datatypes.
/*public class a
{
	public static void display(ArrayList<Object> a)
	{
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i)+" ");
		}
	}
	public static void main(String[] args)
	{
		ArrayList<Object> a=new ArrayList<Object>();
		a.add(1);
		a.add("hello");
		a.add(12.0f);
		a.add(23.908D);
		display(a);
	}
}*/
//Java Generics
/*class emp<tid,tname,tsal>
{
	tid id;
	tname name;
	tsal sal;
	public emp(tid id, tname name, tsal sal)
	{
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	void print()
	{
		System.out.println("ID is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("Salary: "+sal);
	}
	
}
public class a
{
	public static void main(String[] args)
	{
	emp<Integer,String,String> e=new emp(1,"Ravi","Shastri");
	e.print();
	}
}*/
/*class aw<T>
{
	T x;
	/*aw(T x)
	{
		this.x=x;
	//}
	
	T getX() {
		return x;
	}
	void setX(T x) {
		this.x = x;
	}
	void disp()
	{
		System.out.println(x);
	}
}
public class a
{
	public static void main(String[] args)
	{
		//aw<String> c=new aw<String>("Helios");
		//c.disp();
		aw<String> c=new aw<String>();
		c.setX("ABC");
		System.out.println(c.getX());
	}
}*/
/*public class a
{
	public static void main(String[] args)
	{
		try
		{
		//byte[] b= {1,2,3,4,5,6,7};
		String s="Hello Java";
		byte[] b=s.getBytes();
		OutputStream os=new FileOutputStream("C:\\Users\\girid\\desktop\\test.txt");
		for(byte read:b)
		{
			os.write(read);
		}
		os.close();
		InputStream is=new FileInputStream("C:\\\\Users\\\\girid\\\\desktop\\\\test.txt");
		int size=is.available();
		for(int i=0;i<size;i++)
		{
			System.out.print((char)is.read());
		}
		is.close();
		}
		catch(Exception e)
		{
			System.out.println("e "+e.getMessage());
		}
	}
}*/
/*public class a
{
	public static void main(String[] args) throws Exception
	{
		byte[] ae=new byte[800];
		File f=new File("test.txt");
		FileInputStream is = new FileInputStream(f);
		File ax = new File("copy.txt");
		ax.createNewFile();
		FileOutputStream ad = new FileOutputStream("copy.txt");
		is.read(ae);
		ad.write(ae);
		is.close();
		ad.close();
	}
}*/