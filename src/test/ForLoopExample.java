package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num = 0; num < 11; num += 2) { // prints 1 to 10
			System.out.println(num);
		}
		System.out.println("End of for loop");

		for (int num = 10; num > 0; num -= 2) { // prints 10 to 1
			System.out.println(num);
		}
		System.out.println("End of second for loop");

		int[] arr1 = { 2, 3, 4, 5, 6, 8, 9 };
		{
			for (int i = 0; i < arr1.length; i++)

			{
				System.out.println("Element value is: " + arr1[i]);
			}
			//for each loop
			for (int val:arr1) {
				System.out.println("Element value is: "+ val);
			}
			String str1 = "Ruchi";
			for(int i = 0; i<str1.length();i++)
			{
				System.out.println("Character value is: "+ str1.charAt(i));
			}
		}

	}
}