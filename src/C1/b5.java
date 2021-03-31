package C1;

public class b5 {

	public int midNumber(int a, int b, int c) {
		if (b < a && a < c || c < a && a < b)
			return a;
		if (a < b && b < c || c < b && b < a)
			return b;
		return c;
	}

	public static void main(String[] args) {
		int a = 2, b = 1, c = 7;
		b5 objB5 = new b5();
		System.out.println("So trung gian trong 3 so a, b, c la " + objB5.midNumber(a, b, c));
	}
}
