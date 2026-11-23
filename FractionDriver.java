public class FractionDriver{
	
	public static void main (String[] args){
		
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(3,6);
		Fraction f3 = new Fraction("7/56");
		Fraction f4 = new Fraction(f2);
		Fraction mul = Fraction.mult(f2, f3); 
		int G = Fraction.GCF_fr(f2); 
		
		System.out.println(f1);
		System.out.println(f1.getNum() + "/" + f1.getDenum());
		System.out.println(f2.getNum() + "/" + f2.getDenum());
		System.out.println(f3.getNum() + "/" + f3.getDenum());
		System.out.println(f4.getNum() + "/" + f4.getDenum());
		System.out.println(mul.getNum() + "/" + mul.getDenum());
		System.out.println(G);
	}
	
}
