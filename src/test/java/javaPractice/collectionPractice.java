package javaPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

import org.testng.annotations.Test;


public class collectionPractice {
	ArrayList<Object> arrayList;
	@Test
	public void arraylist() {
		arrayList = new ArrayList<Object>();
		arrayList.add("sjdf");
		arrayList.add("yieu");
		arrayList.addAll(2, arrayList);
		arrayList.add(2);
		arrayList.add(2);
		arrayList.add(null);
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		System.out.println(arrayList.indexOf("yieu"));
		System.out.println(arrayList.contains("sjdf"));
		arrayList.remove("sjdf");
		System.out.println(arrayList);
		
			
			Stack<Object> stack = new Stack<Object>();
			stack.push("sd");
			stack.push("ad");
			System.out.println(stack.pop());
			System.out.println(stack.pop());
		
		
	}
	@Test
	public void mn() {
		LinkedList<Object> ll = new LinkedList<Object>();
		ll.addLast("sd");
		ll.add(23);
		ll.add("sdwe");
		ll.add("ewer");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.removeLast());
		ll.remove("sd");
		System.out.println(ll);
	}
}
