package C1;

public class b3 {
	//Giai phuong trinh bac 2
	public void solveFunc(double a, double b, double c, double delta) {
		if(a == 0) 
			System.out.println(-b / c);
		if(delta < 0)
			System.out.println("phuong trinh vo nghiem");
		else if (delta == 0)
			System.out.println("Phuong trinh co nghiem kep = " + -b/(2*a));
		else 
			System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + (-b-Math.sqrt(delta)/(2*a)+"x2 = " + (-b+Math.sqrt(delta))/(2*a)));
	}
	public static void main(String[] args) {
		double a = 1, b = -2, c = 1, delta = Math.pow(b, 2) - 4*a*c;
		b3 objB3 = new b3();
		objB3.solveFunc(a, b, c, delta);
	}
}
