package C1;

public class b2 {
	// Giai phuong trinh bac nhat ax + b = 0
	public void solveFunc(double a, double b) {
		if (a == 0 && b == 0)
			System.out.println("Phuong trinnh vo so nghiem");
		else if (a == 0 && b != 0) 
			System.out.println("Phuong trinh vo nghiem");
		else
			System.out.println("x = " + ((- b / a)==0?"0":(-b/a)));
	}
	public static void main(String[] args) {
		double a = 2, b = 3;
		b2 objB2 = new b2();
		objB2.solveFunc(a, b);
	}
}
