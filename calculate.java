public class calculate {

	public static void main(String [] arg) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int sum = first + second;
		int minus = first - second;
		float adv = first / second;
		float sqr = first * first;
		System.out.println("Sum " + sum);
		System.out.println("Minus " + minus);
		System.out.println("Delenie " + adv);
		System.out.println("Kvadrat 1go " + sqr);	

	}
}