package Collections;
import java.util.*;
public class VotersList {

	public List<Long> voterList(Map<Long,Integer> mm){
		List<Long> li=new ArrayList<>();
		for(Long l: mm.keySet()) {
			if(mm.get(l)>=18) {
				li.add(l);
			}
		}
		return li;
	}
	public static void main(String[] args) {
		Map<Long,Integer> m=new HashMap<>();
		m.put(3253664536l,20);
		m.put(3253664537l,12);
		m.put(3253664538l,34);
		m.put(3253664539l,67);
		m.put(3253664540l,7);
		
		VotersList vl=new VotersList();
		System.out.println("The ids of the persons who can vote : "+vl.voterList(m));
		
		
	}

}
