import java.util.Scanner;

public class Division
{
	public static int divide(int numerator, int denominator)
	{
		int sign = (numerator / Math.abs(numerator)) * (denominator / Math.abs(denominator));

		numerator = Math.abs(numerator);
		denominator = Math.abs(denominator);

		int q = 0;

		while (numerator >= denominator)
		{
			numerator -= denominator;
			q++;
		}

		return q * sign;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, d;
		n = sc.nextInt();
		d = sc.nextInt();
		System.out.println(divide(n, d));
		sc.close();
	}
}