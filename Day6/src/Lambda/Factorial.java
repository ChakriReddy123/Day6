package Lambda;

public class Factorial {

	public static void main(String[] args) {

		Fact f=(x)->{
			int ff=1;
			for(int i=x;i>=1;i--) {
				ff=ff*i;
			}
			return ff;
			};
		System.out.println(f.factorialValue(5));
	}

}
