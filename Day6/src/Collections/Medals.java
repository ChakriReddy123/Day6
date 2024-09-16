package Collections;
import java.util.*;
public class Medals {

	public Map<Long,String> getStudents(Map<Long,Integer> mm){
		Map<Long,String> map=new HashMap<>();
		for(Long l:mm.keySet()) {
			if(mm.get(l)>=90) {
				map.put(l, "Gold");
			}
			else if(mm.get(l)>=80 && mm.get(l)<90) {
				map.put(l, "Silver");
			}
			else if(mm.get(l)>=70 && mm.get(l)<80) {
				map.put(l, "Bronze");
			}
		}
		return map;
	}
	public static void main(String[] args) {
		Map<Long,Integer> m=new HashMap<>();
		m.put(224537635l,89);
		m.put(224537636l,34);
		m.put(224537637l,69);
		m.put(224537638l,98);
		m.put(224537639l,95);
		m.put(224537640l,75);
		
		Medals ms=new Medals();
		System.out.println(ms.getStudents(m));
		
	}

}
