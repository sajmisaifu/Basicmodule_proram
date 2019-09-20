package leap;
import java.util.Scanner;
public class Leapyear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a year ");
		int n=sc.nextInt();
		int a=0;
		
		if(n % 400 == 0)
		{
			a=1;
		}
		else if(n % 100 == 0)
		{
			a=0;
		}
		else if(n % 4 == 0)
		{
			a=1;
		}
		if(a==1)
		{
			System.out.println("leap year ");
		}
		else
		{
			System.out.println("not a leap year ");
		}
}

}