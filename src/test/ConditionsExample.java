package test;
import java.util.Scanner;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int age = 17; //
		int age; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age");
		age = scanner.nextInt();
		if (age< 17)
		{
			System.out.println("You are not eligible for voting.");
		}else if (age == 17)
		{
			System.out.println("You will be eligible for voting next year.");
		}
		else
		{
			System.out.println("You are eligible for voting.");
		}
		scanner.close();
	
if (age > 30 || age <18) {
	
System.out.println("You are not eligible to write Bank exam");

}
	else if(age==30){
	System.out.println("You are eligible to write Bank exam only this Year");
}

}
}