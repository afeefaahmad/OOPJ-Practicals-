public class practical1_2
{
	public static void main(String[] args) {
		System.out.println("Practical 1:2");
		System.out.println("Solving using Crammmer's rule");
        double a = 3.4;
        double b = 50.2;
        double e = 44.5;
        double c = 2.1;
        double d = 0.55;
        double f = 9.5;
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("value of x =" +x);
        System.out.println("value of y =" +y);
	}
}