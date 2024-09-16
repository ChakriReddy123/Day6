package methodReference;

public class Format{

	
	public String stringFormat(String x) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<x.length();i++) {
			sb.append(x.charAt(i));
			if(i<x.length()-1) {
				sb.append(' ');
			}
		}
		return sb.toString();

	}

	
}
