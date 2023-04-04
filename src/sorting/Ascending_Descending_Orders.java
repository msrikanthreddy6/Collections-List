package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ascending_Descending_Orders {

	public static void main(String[] args) {

		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(30);
		list.add(50);
		
		Collections.sort(list);//Ascending Order
		System.out.println(list);
		
		Collections.reverse(list);//Descending Order
		System.out.println(list);
	}

}
