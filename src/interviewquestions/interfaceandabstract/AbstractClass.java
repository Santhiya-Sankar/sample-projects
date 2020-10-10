package interviewquestions.interfaceandabstract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;


/*class Example{
	private int id;
	private String name;
	private String role;
	
	Example(int id, String name, String role){
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}

	
}
*/
public class AbstractClass{
	
	/*private int id;
	private String name;
	private String role;
	
	AbstractClass(int id, String name, String role){
		this.id = id;
		this.name = name;
		this.role = role;
	}

	public static void main(String args[]) {
		List<AbstractClass> list = new ArrayList<>();
		AbstractClass obj1 = new AbstractClass(1, "santhiya", "engineer");
		AbstractClass obj2 = new AbstractClass(2, "jay", "student");
		AbstractClass obj3 =new AbstractClass(3, "amma", "weaver");
		AbstractClass obj4 = new AbstractClass(4, "daddy", "weaver");
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.stream().map(x-> (System.out.println(x.id + " " + x.name + " " + x.role)));		
		
		
		
		
		
		Map<Integer , String > tree = new HashMap<>();
		tree.put(3546, "three");
		tree.put(845656, "eight");
		tree.put(14565, "one");
		tree.put(545656, null);
		tree.put(545656, null);
		tree.put(545656, null);
		tree.put(74564566, "seven");
		tree.put(4123123, "four");
		tree.remove(545656);
		System.out.println(tree.getOrDefault(545656, "hello "));
		tree.forEach((key, value)-> System.out.println("key : " + key + " value : " + value));
		
		Map<String , String > alpha = new TreeMap<>();
		alpha.put("asdfdg", "AAA");
		alpha.put("basdfd", "BBB");
		alpha.put("asde", "EEE");
		alpha.put("afgc", null);
		alpha.put("afdsggh", "HHH");
		alpha.put("asdgd", null);
		alpha.put("adsfff", "FFF");
		alpha.put("fgsdfgag", "GGG");
		alpha.forEach((key, value)-> System.out.println("key : " + key + " value : " + value));
		
		
		String[] arr = new String[10_000];
		System.out.println(arr.length);
		Map<String, String> map = new HashMap<>();
		map.put("santhiya", null);
		map.put("jay", "student");
		map.put("daddy", "weaver");
		map.put("daddy", "weaver");
		map.forEach((key, value)-> System.out.print("name is : " + key + " and role is : " + value));
		System.out.println("\n");		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.print("name is : " + entry.getKey() + " and role is : " + entry.getValue());
		}
System.out.println("\n");		
		Iterator iter = map.entrySet().iterator();
		
		while(iter.hasNext()) {
			Map.Entry entry =  (Entry) iter.next();
			entry.setValue("familiee");
			System.out.print("name is : " + entry.getKey() + " and role is : " + entry.getValue());
		}
		System.out.println("\n");		
		
		A var = new A();
		var.run();
		
		A var1 = new B();
		var1.run();
		
		B var2 = new B();
		var2.run();
	}*/
	
	public static void main(String[] args) {
//		A a = new A();
//		A b  = new B();
		B c = new B();
//		a.run();
//		b.run();
		c.run();
//		System.out.println();
		
//		a = new B();
//		a.run();
		
		
	}
}


class A{
//	static {
//		
//		System.out.println("static block of parent class executed");
//	}
	{
		System.out.println("instance block of parent class executed");
	}
	
		public static void run() {
			System.out.println("parent class running");
		}
		
//		public void sample() {
//			System.out.println("override");
//		}
	}
class B extends A{
//	static {
//		System.out.println("static block of child class executed");
//	}
	{
	System.out.println("instance block of child class executed");
	
	}
	public  static void run() {
		System.out.println("child class running");
	}
	
//	@Override
	public void sample() {
		System.out.println("overridded");
	}
}


