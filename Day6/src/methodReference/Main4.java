package methodReference;

public class Main4 {

	public static void main(String[] args) {

		Facto f=new Facto();
		Fact ff=f::factorialValue;
		System.out.println(ff.factorialValue(5));
	}

}
