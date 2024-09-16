package Lambda;

public class Main2 {

	public static void main(String[] args) {
		String s="Hello Chakri";
		StringFormat sf=(x)->{
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<x.length();i++) {
				sb.append(x.charAt(i));
				if(i<x.length()-1) {
					sb.append(' ');
				}
			}
			return sb.toString();
		};
		
		System.out.println(sf.stringFormat(s));
	}

}
