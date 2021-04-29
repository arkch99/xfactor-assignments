import java.util.Scanner;

public class TaxCalc
{
	public static void main(String[] args) {
		double amt, rate;
		Scanner sc = new Scanner(System.in);
		amt = sc.nextDouble();
		rate = sc.nextDouble();
		System.out.println(amt * (rate/100));
	}
}