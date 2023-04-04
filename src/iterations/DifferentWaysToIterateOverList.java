package iterations;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateOverList {

	public static void main(String[] args) {

		List<String> courses = Arrays.asList("C", "C++", "Java", "HiberNate");

		System.out.println("↓Different Ways To Iterate↓");
		System.out.println("==========================================");
//		Basic For Loop
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i));
		}
		System.out.println("^Basic For Loop^");
		System.out.println("==========================================");
//		Enhanced For Loop
		for (String course : courses) {
			System.out.println(course);
		}
		System.out.println("^Enhanced For Loop^");
		System.out.println("==========================================");
//		Basic Loop With Iterator
		for (Iterator<String> iterator = courses.iterator(); iterator.hasNext();) {
			String course = (String) iterator.next();
			System.out.println(course);
		}
		System.out.println("^Basic Loop With Iterator^");
		System.out.println("==========================================");
//		Iterate with While Loop
		Iterator<String> iterator = courses.iterator();
		while (iterator.hasNext()) {
			String course = (String) iterator.next();
			System.out.println(course);
		}
		System.out.println("^Iterate with While Loop^");
		System.out.println("==========================================");
//		java 8 stream + lambda example
		courses.stream().forEach(course -> System.out.println(course));
		System.out.println("^java 8 stream + lambda example^");
		System.out.println("==========================================");
//		java 8 forEach + lambda example
		courses.forEach(course -> System.out.println(course));
		System.out.println("^java 8 forEach + lambda example^");
		System.out.println("==========================================");
	}

}
