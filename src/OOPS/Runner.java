package OOPS;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		emp1.Name = "Ruchi";
		emp1.EmpID = 15;
		emp1.DisplayName();

		Employee emp2 = new Employee();
		emp2.Name = "Hirdeshwari";
		emp2.EmpID = 15;
		emp2.DisplayName();
		
		Employee emp3 = new Employee("Sharma",1997);
		emp3.DisplayName();
		
		Employee.DisplaySalary();
		
		System.out.println("Crating ct1");
		Citizen ct1 = new Citizen();
		ct1.Name= "Ruchi";
		ct1.Age = 26;
		ct1.SSN = 12345;
		ct1.Country = "India";
		ct1.Print();
		
		System.out.println("Crating ct2");
		Citizen ct2 = new Citizen();
		ct2.Print();
		
		System.out.println("Creating obj");
		Insurance obj = new Insurance();
		obj.InsuranceID = 300;
	    obj.Print();
	    //obj.Print("Hello Class");//
		
		EncapsulationExample emp = new EncapsulationExample();
		emp.setSalary(5000);
		System.out.println("The salary is: " +emp.getSalary());

		
		
		
	}

}









