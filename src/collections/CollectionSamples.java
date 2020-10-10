package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.UnaryOperator;

public class CollectionSamples {

	public static void main(String[] args) {
		
		List list1 = new ArrayList();   
		List list2 = new ArrayList();    
        
        list1.add("Maruti");  
        list1.add("Benz");  
        list1.add(1, "Audi");  
        list1.add("aa");
        
        int i;
		list2.add( i=1);
        list2.add("enova");
        
        System.out.println("retain all : "+list2.retainAll(list1));
          
        System.out.println(list1);
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("santhiya");
		linkedList.add("sankar");
		linkedList.add("sankar");
		linkedList.add("lakshmi");
		linkedList.add("jay");
		linkedList.addFirst("family");
		Collections.sort(linkedList);
		
		LinkedList<String> linkedListnew = new LinkedList<String>();
		linkedListnew.add("a");
		
	System.out.println(linkedListnew.spliterator().characteristics());
	System.out.println("Linked List");	
	Spliterator<String> split = linkedList.spliterator();
	Spliterator<String> split2 = split.trySplit();
	split.forEachRemaining(System.out::println);
	System.out.println("====LINKED LIST====");
	split2.forEachRemaining(System.out::println);
	System.out.println("COMPLETED LINKED LIST");
	
	split.forEachRemaining((n)-> System.out.println(n + " Hello"));
		
	List<String> list = new CopyOnWriteArrayList<>();
    
	list.add("family");
	list.add("santhiya");
	list.add("laksmi");
	list.add("sankar");
	list.add("jay");
	list.add("sundarajan");
	list.add("vatsala");
	list.add("susi");
	Iterator<String> itrStr = list.iterator();
	while(itrStr.hasNext()) {
			String str = itrStr.next();
			list.remove(str);
		System.out.println("List in loop : " + list);
	}
	System.out.println("List outside loop : " + list);
	
	
		CopyOnWriteArrayList concurrentList = new CopyOnWriteArrayList(list);
		while(itrStr.hasNext()) {
			String str = itrStr.next();
			if(str == "family") {
				System.out.println("familyyyyyyyyyyy");
			list.remove(String.valueOf(str));
			}
		System.out.print(str);
		}
		System.out.println("List outside loop : " + list);
    
		List<Integer> integers = new CopyOnWriteArrayList<>();
		integers.add(123513);
		integers.add(123213);
		integers.add(123123213);
		Iterator<Integer> itr = integers.iterator();
		while (itr.hasNext()) {
		    int a = itr.next();
		    if (a == 123213) {
		        integers.remove(Integer.valueOf(a));
		    }
		    System.out.print(a);
		}
		System.out.println("int outside loop : " + integers);
		
		
	Spliterator<String> spliterator1 = list.spliterator();
	Spliterator<String> spliterator2 = spliterator1.trySplit();
	System.out.println("ARRAY LIST");
	spliterator1.forEachRemaining(System.out::println);
	
	while(spliterator2.tryAdvance((n)-> System.out.println(n + " tryadvance")));



	List<String> list3 = new ArrayList();    
	list3.add("Maruti");  
	list3.add("Benz");  
	list3.add(1, "Audi");  
	System.out.println(list3);
	}
}

