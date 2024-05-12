package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Employee {
int id;
String name;
double salary;
public Employee(int id,String name,double salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public static void populate(List<Employee> li) {
	li.add(new Employee(1, "Pranav",1200000));
	li.add(new Employee(2, "Dnyanesh",1000000));
}
public static void main(String[] args) {
	List< Employee> l = new ArrayList<>();
	populate(l);
	BiConsumer<Employee, Double> c = (a,b)->a.salary=a.salary+b;
	
	for(Employee e : l) {
		c.accept(e, 5001000.0);
	}
	for(Employee e :l) {
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);
	}
	
}
	
}
