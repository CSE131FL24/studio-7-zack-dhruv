package studio7;

class Fraction {
	private int numerator; 
	private int denominator;
	public Fraction(int numerator, int denominator) { 
		this.numerator = numerator; 
		this.denominator = denominator;
	}
	public static int lcm(int p, int q) {
		int num1 = p;
		int num2 = q;
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return (num1*num2)/p;
	}
	public static int gcd(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
	private Fraction addFractions(Fraction f1, Fraction f2) {
		int lcm = lcm(f1.denominator, f2.denominator);
		int newNum1 = f1.numerator * lcm/f1.denominator;
		int newNum2 = f2.numerator * lcm/f2.denominator;
		int sum = newNum1 + newNum2;
		Fraction n1 = new Fraction(sum, lcm);
		return n1;
	}
	private Fraction simplify() { 
		int den = gcd(this.denominator, this.numerator);
		Fraction n1 = new Fraction(this.numerator/den, this.denominator/den);
		return n1;
	}
	private Fraction multiplyFractions(Fraction f1, Fraction f2) {
		int newNum = f1.numerator * f2.numerator;
		int newDen = f1.denominator * f2.denominator;
		Fraction n1 = new Fraction(newNum, newDen);
		return n1.simplify();
	}
	private Fraction reciprocal() {
		Fraction n1 = new Fraction(this.denominator, this.numerator);
		return n1;
	}
}
