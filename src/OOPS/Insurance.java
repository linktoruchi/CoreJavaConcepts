package OOPS;

public class Insurance extends Citizen  {
public int InsuranceID;
public Insurance ()
{
	System.out.println("Inside Default constructor Insurance");
}
public void Print()

{
	super.Print();
	System.out.println("Insurance Id is: " +InsuranceID);
	}


}
