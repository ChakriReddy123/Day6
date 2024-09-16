package methodReference;

public class Main2 {

	public static void main(String[] args) {

		Format f=new Format();
		StringFormat sf=f::stringFormat;
		System.out.println(sf.stringFormat("Chakri"));
	}

}
