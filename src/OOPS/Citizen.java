package OOPS;

public class Citizen extends Person {
	public int SSN;

	public Citizen() {
		super();
		
		System.out.println("Inside default constructor");

	}

	public Citizen(String Name, String CountryName, int age, int SSN) {
     super();
		System.out.println("Inside parameterized constructor");

		this.Name = Name;
		this.Country = CountryName;
		this.Age = age;
		this.SSN = SSN;
	}

	public void Print() {
		System.out.println("SSN is:" + SSN);
	}

}





