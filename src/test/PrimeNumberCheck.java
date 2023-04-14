package test;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		int num = 14;
		boolean flag = true;
		for (int i = 2;i<num;i++)
		{
			int remainder = i%2;
			if(remainder ==0)
			{
				flag = false;
				break;
			}
			
			
		}
		if(flag ==true) {
			System.out.println("Number is a prime Number");
		}
		else {
			System.out.println("Number is not a prime Number");
		}

	}

}
