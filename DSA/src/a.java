import java.io.*;
import java.util.*;
import java.lang.Math;
public class a
{
	//public enum Day { Sun, Mon, Tue, Wed, Thu, Fri, Sat }
	public static void main(String args[]) //throws Exception
	{
		/*int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		c=a+b;
		System.out.println("The Sum is :"+c);*/
		/*int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println("A is Greater !");
		}
		else
		{
			System.out.println("B is Greater !");
		}*/
		/*int n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println(i);
		}*/
		/*int n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		i=0;
		while(i<n)
		{
			System.out.println(i);
			i++;
		}*/
		/*char cha;
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A: ");
		a=sc.nextInt();
		System.out.println("Enter the value of B: ");
		b=sc.nextInt();
		System.out.println("Enter the Symbol of operation: ");
		cha=sc.next().charAt(0);
		switch(cha)
		{
			case '+':
			c=a+b;
			System.out.println("The Answer is :"+c);
			break;
			case '-':
			c=a-b;
			System.out.println("The Answer is :"+c);
			break;
			case '*':
			c=a*b;
			System.out.println("The Answer is :"+c);
			break;
			case '/':
			c=a/b;
			System.out.println("The Answer is :"+c);
			break;
			default:
			System.out.println("Ivalid Character");
			break;
		}*/
		/*int a=-5;
		double b=98.2;
		double c=96.7;
		System.out.println(Math.abs(a));
		System.out.println(Math.round(a));
		System.out.println(Math.round(b));
		System.out.println(Math.ceil(c));
		System.out.println(Math.max(c,a));
		System.out.println(Math.min(c,a));
		*/
		/*int n;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of elements in array:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in the array:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The elements in the array are:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}*/
		/*int n,o;
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows in array:");
		n=sc.nextInt();
		System.out.println("Enter the Number of columns in array:");
		o=sc.nextInt();
		int a[][]=new int[n][o];
		System.out.println("Enter the elements in the array:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<o;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The elements in the array are:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<o;j++)
			{
				System.out.println(a[i][j]+" ");
			}
		System.out.println();
		}*/
		/*String a="Xenon";
		String b="Xenon";
		String c="Xenon";
		if(a==b&&b==c)
		{
			System.out.println("NO");
		}
		else if(a!=b&&b!=c)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("Error !");
		}*/
		/*int a=10,b=12,c=15,d;
		d=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(d);*/
		/*int a=10;
		int b=5;
		System.out.println(a);
		System.out.println(b);
		a+=4;
		b-=2;
		System.out.println(a);
		System.out.println(b);*/
		/*String addr="Delhi,Alabama,India";
		if(addr.endsWith("India"))
		{
			if(addr.contains("Meerut"))
			{
				System.out.println("Your city is Meerut");
			}
			else if(addr.contains("Noida"))
			{
				System.out.println("Your city is Noida");
			}
			else
			{
				System.out.println(addr.split(",")[1]);
			}
		}
		else
		{
			System.out.println("You don't live in India");
		}*/
		/*int a=11;
		int b=20;
		int i=11;
		int sum=0;
		while(i<=b)
		{
			sum=sum+i;
			i++;
		}
		System.out.println(sum);*/
		//FOR - Each Loop
		/*String[] a={"java","python","C#","GOlang"};
		for(String i:a)
		{
			System.out.println(i);
		}*/
		/*DO WHILE like...whatever is in do field it is executed once
		and then the condition in while field is check..
		if the condition in while is true then it will keep executing do field until end,
		but if condition is false then loop breaks and do statement is executed only once.*/
		/*int i=2;
		do
		{
			System.out.println(i);
			i=i+2;
		}
		while(i<=20);
		}*/
		/*int i;
		for(i=0;i<10;i++)
		{
			if(i==6)
			{
				break;
			}
			System.out.println(i);
		}*/
		/*for (int i = 0; i < 10; i++)
		{
  		if (i == 4)
		{
    		continue;
  		}
  		System.out.println(i);
		}*/
		/*int a=11;
		if(a%2==0)
		{
			System.out.println("Its is Even number");
		}
		else
		{
			System.out.println("Its is odd number");
		}*/
		/*Scanner sc=new Scanner(System.in);
		char ch =sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");*/
		/*Day[] DayNow = Day.values(); 
		for (Day Now : DayNow) //for each 
		{
			switch(Now) 
			{ 
				case Sun: 
				System.out.println("Sunday"); 
				break; 
				case Mon: 
				System.out.println("Monday"); 
				break; 
				case Tue: 
				System.out.println("Tuesday"); 
				break; 
				case Wed: 
				System.out.println("Wednesday"); 
				break;
				case Thu:
				System.out.println("Thursday"); 
				break; 
				case Fri: 
				System.out.println("Friday"); 
				break; 
				case Sat: 
				System.out.println("Saturday"); 
				break;
			}
			//Direction,Seasons,Colours,Subjects...ASSIGNMENT-1 ENUM.
		}*/
		/*
//Direction,Seasons,Colours,Subjects
		public enum Dir { N, E, W, S, NE, NW, SE, SW }
		public static void main(String args[])
		{
			Dir[] dir = Dir.values(); 
			for (Dir direc : dir) //for each 
			{
				switch(direc) 
				{ 
					case N: 
					System.out.println("North"); 
					break; 
					case E: 
					System.out.println("East"); 
					break; 
					case W: 
					System.out.println("West"); 
					break; 
					case S: 
					System.out.println("South"); 
					break;
					case NE:
					System.out.println("North-East"); 
					break; 
					case NW: 
					System.out.println("North-West"); 
					break; 
					case SE: 
					System.out.println("South-East"); 
					break;
					case SW: 
					System.out.println("South-West"); 
					break;
				}
			}
		}*/
		//Array List
		/*ArrayList<String> a=new ArrayList<String>();
		a.add("Helios");
		a.add("Ajay");
		a.add("Ravi");
		a.add("Sharan");
		a.add("Chaitanya");
		System.out.println(a);
		System.out.println("Sorted one is:");
		Collections.sort(a);//sorts in ascending order.
		System.out.println(a);
		System.out.println(a.get(1));//gets element
		a.set(1,"Kavya");//sets array list.
		System.out.println(a);
		a.remove(1);//removes value in index 1.
		System.out.println(a);
		a.remove("Helios");//removes value by value.
		System.out.println(a);
		int c=a.size();//size of arraylist
		System.out.println(c);
		a.clear();//makes the list empty.
		System.out.println(a);*/
		
		//Linked List
		/*LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}*/
		
		
		//Vector
		/*Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}*/
		
		//stack
		/*Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}*/
		//hash set(Sorts in descending order)
		/*HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ajay");  
		set.add("Ravi");  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}*/
		//Linked Hash-set(As it is)
		/*LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Ravi");  
		set.add("Bhavijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}*/
		//tree set(Ascending)
		/*TreeSet<String> set=new TreeSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");   
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}*/
		
		//prority queue
		/*PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit Sharma");  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());//return head of queue without removing it
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
		queue.remove();//removes next head in the queue(Sorted ascesnding)
		queue.poll();//removes next element in queue(Sorted ascending) 
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext())
		{  
			System.out.println(itr2.next());  
		}*/
		//MAP
		/*Map<Integer, String> map=new HashMap<>();
        map.put(1,"raj");
        map.put(2,"Kiran");
        map.put(3,"Ravi");
        map.put(4,"java");
        //Collections.sort(map.keySet());
		String value=map.remove(3);
		System.out.println(value);
		System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map);
		System.out.println(map.containsValue("raj"));
		System.out.println(map.containsKey(1));         
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		Map<Integer, String> map2=new HashMap<>();
		map2.putAll(map);
		System.out.println(map2);
		*/
		//to read contents and dislay in file
		/*File f=new File("test.txt");
		Scanner sc = new Scanner(f);
		String a=" "
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}*/
		//Copy contents of one file create a new file and copy contents to it.
		/*File f=new File("test.txt");
		long size=f.length();
		int r=(int)size;
		byte[] ae=new byte[r];
		FileInputStream is = new FileInputStream(f);
		File ax = new File("copy.txt");
		ax.createNewFile();
		FileOutputStream ad = new FileOutputStream("copy.txt");
		is.read(ae);
		ad.write(ae);
		is.close();
		ad.close();*/
		
		//JAVA-8 lambda
		List<Integer>l=new ArrayList<Integer>();
		List<String>m=new ArrayList<String>();
		l.add(1);
		l.add(3);
		l.add(5);
		l.add(7);
		l.add(9);
		m.add("hello");
		m.add("name");
		m.add("wahtaj");
		l.stream().map((a)->a*a).forEach(System.out::println);
		//m.replaceAll(String::toUpperCase);
		//m.forEach(System.out::println);
		m.stream().map((e)->e.toUpperCase()).forEach(System.out::println);//
		m.stream().map((e)->e.toLowerCase()).forEach(System.out::println);
	}
}