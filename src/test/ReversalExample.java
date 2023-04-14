package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "RaceCar";
		String result = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			result = result + str1.charAt(i);
		}
		System.out.println("Reverse string is: " + result);
		
		if (str1.equalsIgnoreCase(result)) {
			
			System.out.println("String is pallindrome");
		} else {
			System.out.println("String is not Pallindrome");
		}
		String str2 = "Ruchi meets Rinki";
		String[] arr = str2.split(" ");
		String result1 = " ";
		for(int i = arr.length-1;i>=0;i--)
		{
			result1 = result1+arr[i]+ " ";
		}
		System.out.println("The result is: " +result1.trim());
	}

}
