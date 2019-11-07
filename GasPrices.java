import java.util.Scanner;
public class GasPrices
{
	public static void main(String[] args)
	{
		int pricePerbarrel = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the current gas price per barrel>> ");
		pricePerbarrel = input.nextInt();
		calculatePricepergallon(pricePerbarrel);
	}
	public static void calculatePricepergallon(int ppb)
	{
		final double LOW = 3.50;
		final double HIGH = 4.00;
		final double BASE = 100;
			
		double lowPriceAtPump = ppb/BASE * LOW;
		double highPriceAtPump = ppb/BASE * HIGH;
		System.out.println("When gas is " + ppb + " per barrel, than it is from " 
								+ lowPriceAtPump + " to " + highPriceAtPump + " per gallon");										  
	}
}