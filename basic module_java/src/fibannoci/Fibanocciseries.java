package fibannoci;
import java.util.Scanner;
public class Fibanocciseries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		int n=sc.nextInt();
		int a=0,b=0,c=1,i;
		for(i=0;i<n+3;i++)
		{
			a=b;
			b=c;
			c=a+b;
		
		System.out.println( a+" " );
}
}
}