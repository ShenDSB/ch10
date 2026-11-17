public class FractionDriver{
	
	public static void main (String[] args){
		
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(3,6);
		System.out.println(f1);
		System.out.println(f1.getNum() + "/" + f1.getDenum());
		System.out.println(f2.getNum() + "/" + f2.getDenum());
	}
	
}
