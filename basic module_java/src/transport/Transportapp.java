
package transport;
import java.util.Scanner;
public class Transportapp {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number of applications ");
 int n=sc.nextInt();
 System.out.println("enter the amount ");
 int i;
 int temp=0;
 int[] a=new int[20];
 for(i=0;i<n;i++)
 {
	 a[i]=sc.nextInt();
 }
 for(i=0;i<n;i++)
 {
   if(a[i]>temp)
   {
	   temp=a[i];
   }
 }
 System.out.println("the winning bid is: " +temp);
}
}