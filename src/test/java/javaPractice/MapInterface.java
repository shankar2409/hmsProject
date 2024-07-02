package javaPractice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.annotations.Test;

import io.reactivex.rxjava3.internal.util.LinkedArrayList;

public class MapInterface {
	@Test
	public void m1() {
		System.out.println(System.getProperties());
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("sf");
		ts.add("sd");
		ts.iterator();
		System.out.println(ts);
		HashMap<Integer, Object> hp = new HashMap<Integer, Object>();
		hp.put(1, "sdjf");
		hp.put(2, "eiwoie");
		hp.put(0, null);
		hp.put(3, null);
		System.out.println(hp);
		System.out.println(hp.containsKey(2));
		Set<Entry<Integer, Object>> set = hp.entrySet();
		LinkedList sd = new LinkedList(set);
		System.out.println("===============");
		System.out.println(sd);

		Map<String, Object> ht = new HashMap<String, Object>();
		Set<String> se = ht.keySet();
		ht.put("fk", "skdf");
		ht.put("fk7", "skdf");
		ht.put("fk5", "skdf");
		ht.put("fk3", "skdf");
		ht.put("fk2", "skdf");
		System.out.println(ht);
		for (Entry<String, Object> s : ht.entrySet()) {
			System.out.println(s.getKey() + "  " + s.getValue());
		}
		LinkedHashMap<String, Object> lhp = new LinkedHashMap<String, Object>();
		System.out.println(lhp);
		lhp.put("3fk", "skdf");
		lhp.put("2fk7", "skdf");
		lhp.put("23fk5", "skdf");
		lhp.put("f3k3", "skdf");
		lhp.put("f2k2", "skdf");
		System.out.println(lhp);
		TreeMap<Integer, Object> tm = new TreeMap<Integer, Object>();
		tm.put(1, "skdf");
		tm.put(2, "skdf");
		tm.put(3, "skdf");
		tm.put(4, "skdf");
		tm.put(5, "skdf");
		System.out.println(tm);
		Entry<Integer, Object> ds = tm.floorEntry(0);
		System.out.println(ds);
		Set<Entry<Integer, Object>> sdf = tm.entrySet();

	}
}
