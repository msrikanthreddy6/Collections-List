package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {

		List<Employee>employees=new ArrayList<Employee>();
		employees.add(new Employee(1, "Ramesh", 28, 70000));
		employees.add(new Employee(2, "Suresh", 27, 65000));
		employees.add(new Employee(3, "Mahesh", 26, 80000));
		employees.add(new Employee(4, "Rama", 29, 150000));
		
		//Ascending Order
		Collections.sort(employees, new Mysort());
		System.out.println("Ascending Order-->"+employees);
		System.out.println("--------------------------------");
		
		//Descending Order
		Collections.reverse(employees);
		System.out.println("Reverse Order-->"+employees);
		System.out.println("--------------------------------");
		
		//Descending Order
		Collections.sort(employees, new Mysort1());
		System.out.println("Descending Order-->"+employees);
		System.out.println("--------------------------------");
		
//		Java 8 & Lambda Ascending Order
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary()-o2.getSalary());
			}
		});
		System.out.println("Ascending Order-->"+employees);//Ascending Order
		System.out.println("--------------------------------");
		
//		Java 8 & Lambda Descending Order
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o2.getSalary()-o1.getSalary());
			}
		});
		System.out.println("Descending Order-->"+employees);//Descending Order
		System.out.println("--------------------------------");
		
//		Java 8 & Lambda Ascending Order
		Collections.sort(employees,(o1,o2)->(int)(o1.getSalary()-o2.getSalary()));
		System.out.println("Ascending Order-->"+employees);//Ascending Order
		System.out.println("--------------------------------");
		
//		Java 8 & Lambda Descending Order
		Collections.sort(employees,(o1,o2)->(int)(o2.getSalary()-o1.getSalary()));
		System.out.println("Descending Order-->"+employees);//Descending Order
		System.out.println("--------------------------------");
	}

}
//Ascending Order 
class Mysort implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getSalary()-o2.getSalary());
	}
	
}

class Mysort1 implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o2.getSalary()-o1.getSalary());
	}
	
}