package retest;
import java.util.Scanner;
public class Reteststudnt {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number of students ");
 int n=sc.nextInt();
 System.out.println("enter the marks ");
 int i,count=0;
 int[] a=new int[20];
 for(i=0;i<n;i++)
 {
	 a[i]=sc.nextInt();
 }
 for(i=0;i<n;i++)
 {
   if(a[i]<41)
   {
	   count++;
   }
 }
 System.out.println("number of students for retest " +count);
}
}