import java.util.Random;
import java.util.Scanner;

public class FractionQuiz{

	public static void main (String[] args){
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		String[] signs = {"+","-","*","/"};
		while (true){
			int n1 = random.nextInt(9)+1;
			int d1 = random.nextInt(9)+1;
			int n2 = random.nextInt(9)+1;
			int d2 = random.nextInt(9)+1;
			int sign = random.nextInt(4);
			System.out.print(n1 + "/" + d1 + " " + signs[sign] + " " + n2 + "/" + d2+" = ");
			String cal = in.nextLine();
			Fraction ca = new Fraction(cal);
			if (cal.equals("quit")) break;
			Fraction f1 = new Fraction(n1,d1);
			Fraction f2 = new Fraction(n2,d2);
			if (sign == 0){
				Fraction ans_noreduce = Fraction.add(f1,f2);
				Fraction ans = Fraction.reduce(ans_noreduce);
				if ((ca.getNum()==ans.getNum())&&(ca.getDenum()==ans.getDenum())){
					System.out.println("Correct!");
				}
				else System.out.println("Wrong, the answer was " + ans.getNum() + "/" + ans.getDenum());
				
				
			}
			if (sign == 1){
				Fraction ans_noreduce = Fraction.minus(f1,f2);
				Fraction ans = Fraction.reduce(ans_noreduce);
				if ((ca.getNum()==ans.getNum())&&(ca.getDenum()==ans.getDenum())){
					System.out.println("Correct!");
				}
				else System.out.println("Wrong, the answer was " + ans.getNum() + "/" + ans.getDenum());
				
				
			}
			if (sign == 2){
				Fraction ans_noreduce = Fraction.mult(f1,f2);
				Fraction ans = Fraction.reduce(ans_noreduce);
				if ((ca.getNum()==ans.getNum())&&(ca.getDenum()==ans.getDenum())){
					System.out.println("Correct!");
				}
				else System.out.println("Wrong, the answer was " + ans.getNum() + "/" + ans.getDenum());
				
				
			}
			if (sign == 3){
				Fraction ans_noreduce = Fraction.divide(f1,f2);
				Fraction ans = Fraction.reduce(ans_noreduce);
				if ((ca.getNum()==ans.getNum())&&(ca.getDenum()==ans.getDenum())){
					System.out.println("Correct!");
				}
				else System.out.println("Wrong, the answer was " + ans.getNum() + "/" + ans.getDenum());
				
			}
			
			
		}
	}
}
