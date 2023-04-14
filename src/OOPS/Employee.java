package OOPS;

public class Employee {

	public String Name;
	public int EmpID;
	private static int Salary = 50000;

	public Employee() {
		System.out.println("Inside default constructor");
	}

	public Employee(String var1, int var2) // constructor
	{
		System.out.println("Inside Parameterized constructor");
		Name = var1;
		EmpID = var2;
	}

	public void DisplayName() {

		System.out.println("Name of the Employee is " + Name);
	}
	public static void DisplaySalary()
	{ 
		System.out.println("Salary of all Employee is: " +Salary);
	}
	
}
