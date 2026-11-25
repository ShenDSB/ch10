import java.util.Random;
import java.util.Scanner;

public class FractionQuiz{

	public static void main (String[] args){
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		while (true){
			int n1 = random.nextInt(9)+1;
			int d1 = random.nextInt(9)+1;
			int n2 = random.nextInt(9)+1;
			int d2 = random.nextInt(9)+1;
			int sign = random.nextInt(4);
			String signs = "";
			Fraction f1 = new Fraction(n1,d1);
			Fraction f2 = new Fraction(n2,d2);
			
			if (sign == 0){
				signs = "+";
				Fraction ans = Fraction.add(f1,f2);
				System.out.print(f1.getNum() + "/" + f1.getDenum() + " " + signs + " " + f2.getNum() + "/" + f2.getDenum()+" = ");
			}
			if (sign == 1){
				signs = "-";
				Fraction ans = Fraction.minus(f1,f2);
				System.out.print(f1.getNum() + "/" + f1.getDenum() + " " + signs + " " + f2.getNum() + "/" + f2.getDenum()+" = ");
			}
			if (sign == 2){
				signs = "*";
				Fraction ans = Fraction.mult(f1,f2);
				System.out.print(f1.getNum() + "/" + f1.getDenum() + " " + signs + " " + f2.getNum() + "/" + f2.getDenum()+" = ");
			}
			if (sign == 3){
				signs = "/";
				Fraction ans = Fraction.divide(f1,f2);
				System.out.print(f1.getNum() + "/" + f1.getDenum() + " " + signs + " " + f2.getNum() + "/" + f2.getDenum()+" = ");
				break;
			}
			String cal = in.nextLine();
			Fraction ca = new Fraction(cal);
			if ((ca.getNum()==ans.getNum())&&(ca.getDenum()==ans.getDenum())){
				System.out.println(ans.getNum() + "/" + ans.getDenum());
			}
			
		}
	}
}
