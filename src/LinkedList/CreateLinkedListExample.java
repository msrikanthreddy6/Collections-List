package LinkedList;

import java.util.LinkedList;

public class CreateLinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Banana");
		fruits.add("Watermelon");
		fruits.add("mango");
		System.out.println(fruits);
		fruits.add(2, "Grapes");
		fruits.add(3, "cherry");
		System.out.println(fruits);

	}

}
