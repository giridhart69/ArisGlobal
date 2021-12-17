import java.util.*;
import java.util.stream.*;
class Employee
{
  private String name;
  private String dept;
  private int salary;

  Employee(String name, String dept, int salary)
  {
    this.name = name;
    this.dept = dept;
    this.salary = salary;
  }
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public int getSalary()
  {
    return salary;
  }
  public void setSalary(int salary)
  {
    this.salary = salary;
  }
  public String getDept()
  {
    return dept;
  }
  public void setDept(String dept)
  {
    this.dept = dept;
  }
}
public class EmpStream
{
	public static void main(String[] args) 
	{
	    List<Employee> employeeList = new ArrayList<>();
	    employeeList.add(new Employee("Jack", "Finance", 5500));
	    employeeList.add(new Employee("Lisa", "Finance", 5600));
	    employeeList.add(new Employee("Scott", "Finance", 7000));
	    employeeList.add(new Employee("Nikita", "IT", 4500));
	    employeeList.add(new Employee("Tony", "IT", 8000));
	    List<String> emp = employeeList.stream().filter(e -> e.getDept().equals("Finance")).map(e -> e.getName()).collect(Collectors.toList());
	    emp.forEach(System.out::println);
	}
}