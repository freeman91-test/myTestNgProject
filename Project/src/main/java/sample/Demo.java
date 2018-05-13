package sample;

import java.util.HashMap;

public class Demo {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		
		HashMap<Employee, String> map1 = new HashMap<Employee, String>();
		map1.put(emp1, "Jack");
		map1.put(emp2, "Jack");
		
		System.out.println(map1.size());
		Integer int1= new Integer(1);
		Integer int2= new Integer(2);
		System.out.println("Object:  "+int1+"   "+int2);
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(int1, "Jack");
		map2.put(int2, "jill");
		
		System.out.println(map2);
	}

}
