public class Fraction{
	
	//instance variable (attributes,fields)
	
	private int numerator, denominator;
	
	//constructors
	
	public Fraction() { // defult constructors
		numerator = 114514;
		denominator = 721;
	}
	
	public Fraction(int a, int b ) { // parameterized constructors
		numerator = a;
		denominator = b;
	}
	
	public Fraction(String a) { // parameterized constructors
		int ind = a.indexOf("/");
		String fr = a.substring(0,ind);
		String ba = a.substring(ind+1);
		numerator = Integer.parseInt(fr);
		denominator = Integer.parseInt(ba);
	}
	
	public Fraction(Fraction a) { // parameterized constructors
		numerator = a.numerator;
		denominator = a.denominator;
	}
	
	//behaviour method (Accessor, Mutator, helper)
	
	public int getNum(){
		return numerator;
	}
	
	public int getDenum(){
		return denominator;
	}
	
	public static int GCF_fr (Fraction c){
		int a = c.getNum();
		int b = c.getDenum();
		while (a!=b){
			if (a<b) b-=a ;
			if (a>b) a-=b ;
			if (a==b) break;
		}
		return a;
	}
	
	public static int GCF_int (int a, int b){
		int a = c.getNum();
		int b = c.getDenum();
		while (a!=b){
			if (a<b) b-=a ;
			if (a>b) a-=b ;
			if (a==b) break;
		}
		return a;
	}
	
	public static Fraction mult (Fraction a, Fraction b){
		int n = a.getNum() * b.getNum();
		int d = a.getDenum() * b.getDenum();
		Fraction answer = new Fraction(n,d);
		return answer;
	}
	
	public static Fraction divide (Fraction a, Fraction b){
		int n = a.getNum() * b.getDenum();
		int d = a.getDenum() * b.getNum();
		Fraction answer = new Fraction(n,d);
		return answer;
	}
	
	public static Fraction add (Fraction a, Fraction b){
		int n1 = a.getNum();
		int n2 = b.getNum();
		int d1 = a.getDenum();
		int d2 = b.getDenum();
		Fraction answer = new Fraction(n,d);
		return answer;
	}
}
