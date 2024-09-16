package methodReference;

import java.util.HashMap;
import java.util.Map;

public class Valid{
	 private static Map<String, String> hm = new HashMap<>();


	    static {
	        hm.put("bhAAi", "pushpa123");
	        hm.put("Allu Arjun", "pushparaj");
	        hm.put("Chakri","1234");
	    }
	public boolean verify(String uname, String pass) {
		
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
	}

}
