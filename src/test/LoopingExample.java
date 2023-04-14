package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print 1 to 10 using loop
		int num = 1;
		while (num < 11) {
			System.out.println(num);
			num = num + 1;
		}

		// print 10 to 1 using while loop
		int num1 = 10;
		while (num1 > 0) {
			if (num1 == 5) {
				System.out.println("Stop"); //use skip when continue is used//
				num1--;
				break; //use continue if skip is used//
			}
			System.out.println(num1);
			num1--;
		}

		System.out.println("End of second while loop");

	}
}
