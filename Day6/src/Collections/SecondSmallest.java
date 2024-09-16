package Collections;

import java.util.*;
import java.util.Collections;
import java.util.List;

public class SecondSmallest {
	
	public int getSecondSmallest(int arr[]) {
		List<Integer> l=new ArrayList<>();
		for(Integer x: arr) {
			l.add(x);
		}
		Collections.sort(l);
		return l.get(1);
	}

	public static void main(String[] args) {

		int arr[]= {34,22,77,88,12,5};
		
		SecondSmallest ss=new SecondSmallest();
		System.out.println(ss.getSecondSmallest(arr));
	}

}
