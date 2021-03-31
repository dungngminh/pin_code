package C1;

public class b4 {
	public void solveFunc(double a, double b, double c, double d, double e, double f) {
		double dt = a*e - d*b;
		double dtX = c*e - b*f;
		double dtY = a*f - d*c;
		if(dt == 0) {
			if(dtX + dtY == 0)
				System.out.println("He phuong trinh co vo so nghiem");
			else
				System.out.println("He phuong trinh vo nghiem");
		}
		else 
			System.out.println("He phuong trinh co nghiem (x,y) : x = " + dtX/dt + " y = " + dtY/dt);
	}
	public static void main(String[] args) {
		double a = 1,b = 3,c = 2,d = 4,e =9,f = 4;
		b4 objB4 = new b4();
		objB4.solveFunc(a, b, c, d, e, f);
	}

}
