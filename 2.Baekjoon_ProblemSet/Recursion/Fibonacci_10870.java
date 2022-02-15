package Recursion;
import java.util.Scanner;
public class Fibonacci_10870 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	sc.close();
	System.out.println(F(num));
	}
	
	public static int F(int n) {	
		if(n<=1)
			return n;
		else
			return F(n-2)+F(n-1);
	}
}
