package methodReference;

public class Main3 {

	public static void main(String[] args) {

		Valid v=new Valid();
		Validation vd=v::verify;
		System.out.println(vd.verify("Chakri", "1234"));
	}

}
