package average;
import java.util.Scanner;
public class Averagemarks {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number of students ");
  int n=sc.nextInt();
  System.out.println("enter the marks ");
  int[] a=new int[20];
  int sum=0,avg;
  int i;
  for(i=0;i<n;i++)
  {
	  a[i]=sc.nextInt();
  }
  for(i=0;i<n;i++)
  {
	  sum=sum+a[i]; 
  }
  
   avg=sum/n;
	
System.out.println("avg "+avg);
}
}
