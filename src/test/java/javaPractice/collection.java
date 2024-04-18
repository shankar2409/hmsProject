package javaPractice;

import java.util.ArrayList;
import java.util.LinkedList;

import org.testng.annotations.Test;

public class collection {
	@Test
	public void arraylist() {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("23");
		list.add("342342");
		list.add(423);
		list.add('a');
		list.add("23");
		list.add('a');
		System.out.println(list);
		System.out.println(list.get(0));
		
		//order of insertion is maintained 
		//duplicats are allowed
		//list fetch the data with the help of index
		//it stores heterogeneous type of data
	}
	@Test
	public void linkedList() {
		LinkedList<Object> list = new LinkedList<Object>();
		list.add("23");
		list.add("342342");
		list.add(423);
		list.add('a');
		list.add("23");
		list.add('a');
		list.push("rerw");
		list.push("rw4er3");
		
		System.out.println(list.poll());
		System.out.println(list);
//		System.out.println(list.get(0));
	}
}
