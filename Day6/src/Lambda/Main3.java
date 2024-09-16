package Lambda;
import java.util.*;
public class Main3 {
	public static void main(String args[]) {
			Map<String,String> hm=new HashMap<>();
			hm.put("Chakri","1234");
			hm.put("bhAAi","5645");
			
			Validation v=(uname,pass)->{
				if(hm.containsKey(uname)) {
					if(hm.get(uname).equals(pass)) {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			};
			System.out.println(v.verify("bhAAi", "5645"));
			
	}

}
