import java.util.*;

public class PrimeNumberTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		long sayi =in.nextLong();
		if(isPrimeNumber(sayi))
		{
			System.out.printf("%d is PRİME",sayi);
		}
		else
		{
			System.out.printf("%d is NOT prime",sayi);
		}
		
	}

	public static boolean isPrimeNumber(long number) {
		if(number==1 || number<=0)
		{
			return false;
		}
		for(double i=2;i<Math.pow(number, 1.0/2); i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
	}

}