package Collections;
import java.util.*;
public class Squares {
	public Map<Integer,Integer> squareOf(int arr[]){
		Map<Integer,Integer> hm=new HashMap<>();
		for(int x:arr) {
			hm.put(x, x*x);
		}
		return hm;
	}
	public static void main(String[] args) {
		int arr[]= {2,5,6,3,4,9};
		Squares s=new Squares();
		System.out.println(s.squareOf(arr));
		
	}

}
