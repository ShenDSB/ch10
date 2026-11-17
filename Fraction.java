public class Fraction{
	
	//instance variable (attributes,fields)
	
	private int numerator, denominator;
	
	//constructors
	
	public Fraction() { // defult constructors
		numerator = 114514;
		denominator = 0721;
	}
	
	public Fraction(int a, int b ) { // parameterized constructors
		numerator = a;
		denominator = b;
	}
	
	
	//behaviour method (Accessor, Mutator, helper)
	
	public getNum(){
		return numerator;
	}
	
	public getDenum(){
		return denominator;
	}
	
	
}
