package Collections;
import java.util.*;
public class Hashmap1 {

	public List getValues(HashMap<String,Integer> hh) {
		List<Integer> l=new ArrayList<Integer>();
		
		l.addAll(hh.values());

		Collections.sort(l);
		return l;
	}
	public static void main(String[] args) {

		Hashmap1 h=new Hashmap1();
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("Pavan", 5);
		hm.put("Chakri",1);
		hm.put("hemanth",3);
	
	    List ll=h.getValues(hm);
	    System.out.println(ll);
		
	}

}
