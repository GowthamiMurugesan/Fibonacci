import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
int f1=0;
int f2=1;
int f3;
int n;int sum=0;
Scanner in=new Scanner(System.in);
n=in.nextInt();
System.out.println(f1);
System.out.println(f2);
for(int i=2;i<=n;i++){
	f3=f1+f2;
	f1=f2;
	f2=f3;
	System.out.println(f3);
sum=sum+f3;
}
System.out.println("the sum is:"+sum);
	}

}
