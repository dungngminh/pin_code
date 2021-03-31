package C1;

public class b6 {
	public void solveFunc(int a, int b) {
		int hour = b - a;
		if (b < 18)
			System.out.println("Tien la " + hour * 45000);
		else {
			int temp = b - 18;
			System.out.println("Tien la " + (hour * 45000 + temp * 60000));
		}
	}

	public static void main(String[] args) {
		int a = 6, b = 19;
		b6 obj = new b6();
		obj.solveFunc(a, b);
	}
}
