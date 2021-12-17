import java.io.*;
import java.util.*;
import java.lang.*;
//pre-increment and post-increment,Post-decrement and pre-decrement.
//Operators basics.
//multiple inheritance learn must.
//encapsulation learn.
//wrapper class.
//Association,aggregartion and Composition in java
//geeksforgeeks.org/association-composition-aggregation-java/
/*class s
{
	int id;
	String name;
}
class add
{
	public static void main(String args[])
	{
		s a=new s();
		s b=new s();
		Scanner sc=new Scanner(System.in);
		a.id=32;
		a.name="Friday";
		b.id=44;
		b.name="Xenon";
		System.out.println("1st method "+a.id+"\n");
		System.out.println("1st method "+a.name+"\n");
		System.out.println("2nd method "+b.id+"\n");
		System.out.println("2nd method "+b.name+"\n");
	}
}*/
/*class s
{
	int rn;
	String name;
	public void insert(int roll,String n)
	{
		rn=roll;
		name=n;
	}
	void display()
	{
		System.out.println("Rollnumber is "+rn+" Name is "+name);
	}
}
class gre
{
	public static void main(String args[])
	{
		s w=new s();
		s x=new s();
		w.insert(2013,"Hariharan");
		x.insert(2014,"Ravinarayan");
		w.display();
		x.display();
	}
}*/
/*class w
{
	int a,b,c;
	public int sun(int d,int e)//with void remove return c rest stays the same.
	{
		a=d;
		b=e;
		c=a+b;
		return c;
	}
	public static void main(String args[])
	{
		w sd=new w();
		sd.sun(5,9);
		System.out.println(sd.c);
	}
}*/
/*class a
{
	int id,salary;
	String name;
	void insert(int a,String b,int c)
	{
		id=a;
		name=b;
		salary=c;
		System.out.println("Employee id is:"+id+"\n"+"Employee name is:"+name+"\n"+"Employee salary is:"+salary+"\n");
	}
}
class b
{
	public static void main(String args[])
	{
		a er=new a();
		a we=new a();
		er.insert(0034,"Ravishankar",50000);
		we.insert(0125,"Eshwar",78000);
	}
}*/
/*class a
{
	void add()//when we use satatic for any fucntion no need to create an object.
	{
		System.out.println("hello");
	}
	public static void main(String args[])
	{
		a e=new a();
		e.add();
	}
}*/
/*class a
{
	int length;
	int width;
	int ans;
	void insert(int l,int w)
	{
		length=l;
		width=w;
		ans=length*width;
		System.out.println("The area is: "+ans);
	}
}
class b
{
	public static void main(String args[])
	{
		a e=new a();
		e.insert(2,7);
	}
}*/

/*class a
{
	int f=1;
	void fact(int n)
	{
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial is:"+f);
	}
	public static void main(String args[])
	{
		//a e=new a();
		new a().fact(5);//anonymous object
	}
}*/
/*class a
{	
	static void calc(int l,int b)
	{
		int result=l*b;
		System.out.println(result);
	}
	public static void main(String args[])
	{
		calc(7,8);
	}
}*/
/*class a
{
	void insert(int l,int w)
	{
		int ans=l*w;
		System.out.println("The area is: "+ans);
	}
}
class b
{
	public static void main(String args[])
	{
		a e=new a();
		e.insert(2,7);
	}
}*/
/*class w
{
	int c;
	public int sun(int d,int e)//with void remove return c rest stays the same.
	{
		c=d+e;
		return c;
	}
	public static void main(String args[])
	{
		w sd=new w();
		sd.sun(5,9);
		System.out.println(sd.c);
	}
}*/
/*class a
{		int len;
		int wid;
		void insert(int l,int w)
		{
			len=l;
			wid=w;
		}
		void calc()
		{
			System.out.println("Area of rectangle is:"+(len*wid));
		}
		public static void main(String[] args)
		{
			a w=new a();
			w.insert(7,2);
			w.calc();
		}
}*/

//banking example
/*class w
{	
	int accno;
	String name;
	float amount;
	void insert(int acc,String n,float amt)
	{
		accno=acc;
		name=n;
		amount=amt;
	}
	void withdraw(float amt)
	{
		if(amount<amt)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
			amount=amount-amt;
			System.out.println(amt+"withdrawn");
		}
	}
	void checkbalance()
	{
		System.out.println("Balance amount is"+amount);
	}
	void display()
	{
		System.out.println(accno+" "+name+" "+amount);
	}
	void deposit(float amt)
	{
		amount=amount+amt;
		System.out.println(amt+"Deposited");
	}
}
class c
{
	public static void main(String[] args)
	{
		w x=new w();
		x.insert(23412, "Ankit", 1000);
		x.display();
		x.checkbalance();
		x.deposit(4000);
		x.checkbalance();
		x.withdraw(15000);
		x.checkbalance();
	}
}*/
//default constructor
/*class a
{
	a()
	{
		System.out.println("Hello !");
	}
	public static void main(String[] args)
	{
		a s=new a();
		a x=new a();
	}
}*/
//default constructor
/*class bike
{
	bike()
	{
		System.out.println("Bike is created");
	}
}
class bikemain
{
	public static void main(String[] args)
	{
		bike a=new bike();
		bike b=new bike();
	}
}*/
//parametersied constructor
/*class a
{
	int id;
	String name;
	int age;
	a(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println("Your ID is:"+id+"\n"+"Your name is:"+name);
	}
	public static void main(String[] args)
	{
		a x=new a(201,"Helios");
		a d=new a(203,"Xenon");
		x.display();
		d.display();
	}
}*/
//method overloading
/*class a
{
	static int add(int c,int d)
	{
		return c+d;
	}
	static int add(int c,int d,int e)
	{
		return c+d+e;
	}
}
class b
{
	public static void main(String[] args)
	{
	System.out.println(a.add(11,11));
	System.out.println(a.add(11,11,11));
	}
}*/
//constructor overloading
/*class a
{
	int id;
	String name;
	int age;
	a(int i,String n)
	{
		id=i;
		name=n;
	}
	a(int i,String n,int ag)
	{
		id=i;
		name=n;
		age=ag;
	}
	void display()
	{
		System.out.println("Your ID is:"+id+"\n"+"Your name is:"+name+"\n"+age);
	}
	public static void main(String[] args)
	{
		a x=new a(201,"Helios");
		a d=new a(203,"Xenon",23);
		x.display();
		d.display();
	}
}*/
//this keyword
/*class Student
{  
	int rollno;  
	String name;  
	float fee;  
	Student(int rollno,String name,float fee)
	{  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
	}  
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}  
}  
  
class TestThis2
{  
	public static void main(String args[])
	{  
		Student s1=new Student(111,"ankit",5000f);  
		Student s2=new Student(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
	}
}*/
//copy constructor implicitly
/*class a
{
	int id;
	String name;
	a(int d,String n)
	{
		id=d;
		name=n;
	}
	a(a e)
	{
		id=e.id;
		name=e.name;
	}
	void display()
	{
		System.out.println("Your ID is:"+id+"\n"+"Your name is:"+name);
	}
	public static void main(String[] args)
	{
		a o=new a(21,"Raju");
		a d=new a(o);
		o.display();
		d.display();
	}
}*/
//copy constructor explicitly
/*class a
{
	int id;
	String name;
	a(int d,String n)
	{
		id=d;
		name=n;
	}
	a()
	{
	
	}
	void display()
	{
		System.out.println("Your ID is:"+id+"\n"+"Your name is:"+name);
	}
	public static void main(String[] args)
	{
		a o=new a(21,"Raju");
		a d=new a();
		d.id=o.id;
		d.name=o.name;
		o.display();
		d.display();
	}
}*/
//static keyword use java
/*class a
{
	int roll;
	String name;
	static String col="NIT";
	a(int r,String n)
	{
		roll=r;
		name=n;
	}
	void display()
	{
		System.out.println(roll+" "+name+" "+col);
	}
}
class b
{
	public static void main(String[] args)
	{
		System.out.println(a.col);
		a e=new a(23,"Raju");
		a d=new a(43,"Aryan");
		e.display();
		d.display();
		
	}
}*/
//static keyword illustration
/*class a
{
	static int c=0;
	a()
	{
		c++;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		a b=new a();
		a c=new a();
		a d=new a();
	}
}*/
//static method illustration
/*class a
{
	int roll;
	String name;
	static String college="BDIT";
	static void change()
	{
		college="NIT";
	}
	a(int r,String n)
	{
		roll=r;
		name=n;
	}
	void display()
	{
		System.out.println(roll+" "+ name+" "+ college);
	}
}
class b
{
	public static void main(String[] args)
	{
		System.out.println(a.college);
		a.change();
		System.out.println(a.college);
		a b=new a(111,"kalyan");
		a c=new a(121,"keerthi");
		b.display();
		c.display();
	}
}*/
//static block is executed first
/*class a
{
	static
	{
		System.out.println("First static");
	}
	public static void main(String[] args)
	{
		System.out.println("Main First");
	}
}*/
//single-inheritance
/*class a
{
	int salary=50000;
}
class b extends a
{
	int bonus=10000;
}
class c
{
	public static void main(String[] args)
	{
		b e=new b();
		System.out.println("salary is:"+e.salary);
		System.out.println("Bonus is:"+e.bonus);
	}
}*/
//multi-level inheritance
/*class a
{
	int a=1000;
}
class b extends a
{
	int b=2000;
}
class c extends b
{
	int c=b+a;
}
class d
{
	public static void main(String[] args)
	{
		c e=new c();
		System.out.println("Salary is:"+e.a);
		System.out.println("Bonus is:"+e.b);
		System.out.println("Net pay is:"+e.c);
	}
}*/
//Hierarchical-Ineritance
/*class a
{
	int a=7000;
}
class b extends a
{
	int b=2000;
}
class c extends a
{
	int c=a+a;
}
class d
{
	public static void main(String[] args)
	{
		c e=new c();
		b f=new b();
		System.out.println("Salary is:"+e.a);
		System.out.println("Bonus is:"+f.b+" "+" Main salary is"+f.a);
		System.out.println("Hike pay is:"+e.c);
	}
}*/
//this keyword
/*class a
{
	int rno;
	String name;
	int fees;
	a(int rno,String name,int fees)
	{
		this.rno=rno;
		this.name=name;
		this.fees=fees;
	}
	void disp()
	{
		System.out.println(rno+" "+name+" "+fees);
	}
}
class b
{
	public static void main(String[] args)
	{
		a e=new a(32,"Ganga",32000);
		e.disp();
		a f=new a(42,"Arya",92000);
		f.disp();
	}
}*/
//this class current method
/*class a
{
	void m()
	{
		System.out.println("Hello m");
	}
	void n()
	{
		System.out.println("Hello n");
		m();
	}
}
class b
{
	public static void main(String[] args)
	{
		a w=new a();
		w.n();
		a x=new a();
		x.n();
	}
}*/
//constructor chaining
/*class a
{
	a()
	{
		System.out.println("Hello a");
	}
	a(int x)
	{
		this();
		System.out.println(x);
	}
	a(int x,int y)
	{
		this(20);
		System.out.println(x+" "+y);
	}
}
class b
{
	public static void main(String[] args)
	{
		//a w=new a(10);
		//a x=new a();
		a y=new a(10,20);
	}
}*/
/*class addr
{
	String city,state;
	static String country="India";
	addr(String city,String state)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
class emplo
{
	String name;
	int id;
	addr ad;
	emplo(int id,String name,addr ad)
	{
		this.id=id;
		this.name=name;
		this.ad=ad;
	}
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(ad.city+" "+ad.state+" "+ad.country);
	}
	public static void main(String[] args)
	{
		addr a=new addr("Mysore","Karnataka");
		addr b=new addr("Kanchipuram","Tamilnadu");
		emplo e=new emplo(231,"Harindra Nayak",a);
		emplo f=new emplo(211,"Sinchana Murthy",b);
		e.display();
		f.display();
	}
}*/
/*class a
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static double add(double a,double b)
	{
		return a+b;
	}
}
class b
{
	public static void main(String[] args)
	{
		a e=new a();
		System.out.println(e.add(11,22));
		System.out.println(e.add(11.23,22.42));
	}
}*/

/*
//method overloading
class a
{
	/*void sum(int a,int b)
	{
		System.out.println("This is int");
		System.out.println(a+b);
	}*//*
	void sum(long a,long b)
	{
		System.out.println("This is long");
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println("This is Bleh !");
		System.out.println(a+b+c);
	}
	public static void main(String[] args)
	{
		a e= new a();
		e.sum(20,20);
		e.sum(20,20,20);
	}
}*/
/*
//method overriding
class Vehicle
{  
  //defining a method  
  void run()
  {
  	System.out.println("Vehicle is running");
  }  
}  
//Creating a child class  
class Bike2 extends Vehicle
{   
  void run()
	{
		System.out.println("Bike is running safely");
	}  
  
  public static void main(String args[])
  {  
	  Bike2 obj = new Bike2();
	  Vehicle a=new Vehicle();
	  obj.run();
	  a.run();
  }  
}*/
//final keyword:
/*It can be used in a class,variable,method.
when used in :
	class-Class cannot be extended.
	variable-we cannot change or update it's value.
	method-we cannot override the method.*/
//abstract class 1
/*abstract class Shape
{  
	abstract void draw();
}  
class Rectangle extends Shape
{  
	void draw()
	{
		System.out.println("drawing rectangle");
	}  
}  
class Circle1 extends Shape
{  
	void draw()
	{
		System.out.println("drawing circle");
	}  
}  
class a
{  
	public static void main(String args[])
	{  
		Shape s=new Circle1();
		s.draw();  
	}  
}*/
//abstract class 2
/*abstract class Bike
{  
   Bike()//default constructor-it will  be invoked automatically
   {
		System.out.println("bike is created");
   }  
   abstract void run();  
   void changeGear()
   {
   		System.out.println("gear changed");
   }  
}
class Honda extends Bike
{  
	void run()
	{
		System.out.println("running safely..");
	}  
}
class a
{  
	public static void main(String args[])
	{  
		Bike obj = new Honda();  
		obj.run();  
		obj.changeGear();  
	}
}*/
//exception handling
/*class a
{
	public static void main(String[] args)
	{
	int a=0;
	int b=10;
	try
	{
	int c=b/a;
	System.out.println(c);
	}
	catch(Exception e)
	{
		System.out.println("Something went wrong");
	}
	finally
	{
		System.out.println("Program executed succesfully !");
	}
	}
}*/
//exception handling throws keyword
/*class a
{
	static void checkAge(int age)
	{
		if (age < 18)
		{
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		}
		else
		{
			System.out.println("Access granted - You are old enough!");
		}
	}
	public static void main(String[] args)
	{
	   checkAge(15); // Set age to 15 (which is below 18...)
	}
}*/
//wrapper class
/*class a
{
	public static void main(String[] args)
	{
		String c="10";
		String s="85.6";  
		double d=Double.parseDouble("23.6");  
		float r=Float.parseFloat("47.6");  
		int a=Integer.parseInt(c);
		System.out.println("Float:"+r);
		System.out.println("Double:"+d);
		System.out.println("int:"+a);
	}
	
}*/
//wrapper class but using fucntions
/*
class a
{
	float bz;
	int cz;
	double dz;
	void input(String x)
	{
		float b=Float.parseFloat(x);
		int c=Integer.parseInt(x);
		double d=Double.parseDouble(x);
		bz=b;
		cz=c;
		dz=d;
	}
	void disp()
	{
		System.out.println("Float:"+bz);
		System.out.println("Integer:"+cz);
		System.out.println("Double:"+dz);
		
	}
}
class b
{
	public static void main(String[] args)
	{
	a e=new a();
	e.input("30");
	e.disp();
	}
}*/
/*class Student
{

	public String toString() 
	{
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	private String id;
	private String name;
	private int age;
}
	
class ArrayDemo
{
	public static void main(String args[])
	{
		Student[] name=new Student[10];
		for(int i=0;i<name.length;i++)
		{
			name[i]=new Student();
		}
		name[0].setId("1");
		name[0].setName("Abc");
		name[0].setAge(25);
		name[1].setId("2");
		name[1].setName("Rajan");
		name[1].setAge(25);
		name[2].setId("3");
		name[2].setName("Priya");
		name[2].setAge(25);
		for(Student s:name)
		{
			System.out.println(s.toString());
		}
	}
}*/
//threading concept
/*
class DemoThreadInterface implements Runnable
{
	public void run()
	{
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println("My Thread ..."+i+ " "+Thread.currentThread().getName());
		}
	}
	
}
class DemoThread extends Thread
{
	public void run()
	{
		super.run();
		System.out.println("My Thread ..."+currentThread().getName());
	}
}
class MyThread
{
	public static void main(String args[])
	{
		//DemoThread demoThread=new DemoThread();
		//demoThread.start();
		DemoThreadInterface demoThreadInterface=new DemoThreadInterface();
		Thread t1=new Thread(demoThreadInterface);
		Thread t2=new Thread(demoThreadInterface);
		t1.setName("t1");
		t2.setName("t2");
		t2.setPriority(10);
		t1.start();
		t2.start();
	}
}
*/
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
		// TODO Auto-generated method stub
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
/*
//Array in different style
class a 
{
	int n=4;
	class Data
	{
		int roll;
		String name;
		int marks;
		long phone;
		Data(int roll, String name, int marks, long phone)
		{
			this.roll = roll;
			this.name = name;
			this.marks = marks;
			this.phone = phone;
		}
	}
	public static void main(String args[])
	{
		int roll[] = { 1, 2, 3, 4 };
		String name[] = { "Sanjay", "Akshay", "Deepika", "Ranbir" };
		int marks[] = { 100, 99, 93, 94 };
		long phone[] = { 8762357381L, 8762357382L,8762357383L, 8762357384L };
		a ag1 = new a();
		ag1.addValues(roll, name, marks, phone);
	}
	public void addValues(int roll[], String name[],int marks[], long phone[])
	{
		ArrayList<Data> list = new ArrayList<>();
		for (int i = 0; i < n; i++)
		{
			list.add(new Data(roll[i], name[i], marks[i],phone[i]));
		}
		printValues(list);
	}
	public void printValues(ArrayList<Data> list)
	{
		for (int i = 0; i < n; i++)
		{
			Data data = list.get(i);
			System.out.println(data.roll + " " + data.name+ " " + data.marks + " "+ data.phone);
		}
	}
}*/