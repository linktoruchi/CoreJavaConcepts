package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "John", "Smith", "Leena", "Priya" };
		System.out.println("The second name is: " + names[1]);

		ArrayList<String> list1 = new ArrayList<String>();

		list1.add("John");
		list1.add("Smith");
		list1.add("Leena");
		list1.add("Priya");

		System.out.println("The list is: " + list1);
		System.out.println("The size of the list is: " + list1.size());
		System.out.println("First name in the list is: " + list1.get(0));
		System.out.println("Lat name in the list is: " + list1.get(list1.size() - 1));

		list1.add(1, "Mike"); // use set to update data
		System.out.println("List after updating: " + list1);

		list1.remove(1); // remove data
		System.out.println("List after removing is: " + list1);

		// iterate through the list
		for (int i = 0; i < list1.size(); i++) {
			System.out.println("Element name: " + list1.get(i));
		}
		for (String value : list1) {
			System.out.println("Element Value: " + value);
		}
		Iterator<String> itr = list1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(list1);
		System.out.println("After sorting the list: " + list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("After sorting in descending order: "+list1);

	}

}
