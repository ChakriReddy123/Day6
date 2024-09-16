package Lambda;

public class Main1 {

	public static void main(String[] args) {

		Power p=(x,y)->{
			return (int)Math.pow(x, y);
		};
		System.out.println(p.power(5, 2));
		
	}

}
