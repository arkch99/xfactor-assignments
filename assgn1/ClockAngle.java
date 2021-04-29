import java.util.Scanner;

public class ClockAngle
{
	public static double findAngle(int hour, int minute)
	{
		double degreesPerMin_HourHand = 360.0 / (12 * 60);
		double degreesPerMin_MinHand = 360 / 60;

		if(hour == 12)
		{
			hour = 0;
		}

		double hourAngle = ((hour * 60) + minute) * degreesPerMin_HourHand;
		double minuteAngle = minute * degreesPerMin_MinHand;
		double diff = Math.abs(hourAngle - minuteAngle);
		if(diff > 180)
		{
			diff = 360 - diff;
		}
		return diff;
	}

	public static void main(String args[])
	{
		int hour, min;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hours:");
		hour = sc.nextInt();
		System.out.println("Enter minutes:");
		min = sc.nextInt();
		System.out.println(findAngle(hour, min));
		sc.close();
	}
}