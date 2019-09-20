package championship;
import java.util.Scanner;
public class Eligibleplayer {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number of players ");
 int n=sc.nextInt();
 System.out.println("enter the number of fouls made by each player ");
 int i,j;
 int temp=0;
 int index=0;
 int[] a=new int[20];
 for(i=0;i<n;i++)
 {
	 a[i]=sc.nextInt();
 }
 for(j=0;j<=n;j++)
 {
   if(a[i]<temp)
   {
	   temp=a[i];
	   index=i;
   }
 }
 System.out.println("the eligible player is player no:");
}
}