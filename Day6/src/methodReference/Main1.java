package methodReference;

public class Main1 {

	public static void main(String[] args) {

		Pow p=new Pow();
		Power pow=p::power;
		System.out.println(pow.power(5, 2));
	}

}
