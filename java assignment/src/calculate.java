import java.util.*;

public class calculate {

public static void main(String args[]) {
	int a,b,sum,diff;
	float avg;
	Scanner buf= new Scanner(System.in);
	System.out.println("Input first number :");
	a= buf.nextInt();
	System.out.println("Input second number :");
	b=buf.nextInt();
	sum=a+b;
	diff=a-b;
	avg=(float)((a+b)/2);
	System.out.println("sum: "+sum+ "\ndiff: "+diff+  "\naverage :" +avg);
	
}
}