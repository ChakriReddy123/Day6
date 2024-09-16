package Collections;
import java.util.*;
public class CountChar {

	Map<Character,Integer> countChars(char arr[]){
		Map<Character,Integer> mm=new HashMap<>();
		for(char x:arr) {
			if(x!=' ') {
			if(!mm.containsKey(x)) {
				mm.put(x,1);
			}
			else {
				mm.put(x, mm.get(x)+1);
			}
			}
		}
		return mm;
	}
	public static void main(String[] args) {
		String s="Chakri is a super hero";
		char arr[]=s.toCharArray();
		CountChar c=new CountChar();
		System.out.println(c.countChars(arr));
	}

}
