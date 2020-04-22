package practica4;

public class Numbers {
	
	public static int compare(int a, int b) {
		if(a>=b) {
			return a;
		}else {
			return b;
		}
	}
	public static int compare(int a, int b, int c) {
		return compare(compare(a,b),c);
		}
	public static double iva(double precio, int cantidad) {
		double tax = (precio*cantidad*0.14);
		return tax;
	}
	public static double iva(int cantidad, double precio) {
		return iva(precio, cantidad);
	}
}
