public class FractionDriver{
	
	public static void main (String[] args){
		
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(3,6);
		Fraction f3 = new Fraction("296236/902107");
		Fraction f4 = new Fraction(f2);
		System.out.println(f1);
		System.out.println(f1.getNum() + " divided by " + f1.getDenum());
		System.out.println(f2.getNum() + " divided by " + f2.getDenum());
		System.out.println(f3.getNum() + " divided by " + f3.getDenum());
		System.out.println(f4.getNum() + " divided by " + f4.getDenum());
	}
	
}
