package collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class LearnList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<>(15);
		list.add(new Student("santhiya", 24, "VIP"));
		list.add(new Student("jay", 15, "school"));
		list.add(new Student("lakshmi", 45, "house wife"));
		list.add(new Student("sankar", 54, "weaver"));
		list.add(new Student("sundarrajan", 81, "weaver"));
		list.add(new Student("vatsala", 75, "house wife"));
		Collections.sort(list);
		System.out.println(list);
		
		for(Student st : list) {
			System.out.println(st.getRole() + " " + st.getName() + " " + st.getAge());
		}
		
		List<String> str = new ArrayList<String>();
		List<String> result = new ArrayList<String>();
		str.add("a");
		str.add("b");
		str.add("c");
		str.add("d");
		str.add("e");
		
		int r = 2;
		
		result = str.subList(r, str.size());
		result.addAll(str.subList(0, r));
		System.out.println(result);
		
		}
}


class Student implements Comparable<Student>{
	private String name;
	private int age;
	private String role;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public Student(String name, int age, String role) {
		this.name = name;
		this.age = age;
		this.role = role;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if(this.age == st.getAge()) {
			return 0;
		}
		else if(this.age>st.getAge()) {
			return 1;
		}
		else
			return -1;
	}
}