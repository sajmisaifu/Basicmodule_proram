package jumbled;
import java.util.Scanner;
public class Jumpp {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number alphabet in name ");
  int n=sc.nextInt();
  int i,fact=1;
  for(i=1;i<=n;i++)
  {
  fact=fact*i;
  }
  System.out.println("number of combinations is " +fact);
	}

}
