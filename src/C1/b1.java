package C1;

public class b1 {
	public int returnMax(int a, int b, int c) {
		return a < b ? (b < c ? c : b) : (a < c ? c : a);
	}

	public static void main(String[] args) {
		int a = 5, b = 2, c = 10;
		b1 objB1 = new b1();
		System.out.println("Gia tri lon nhat trong 3 a b c la " + objB1.returnMax(a, b, c));
	}
}
