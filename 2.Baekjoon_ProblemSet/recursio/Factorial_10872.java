package recursio;
import java.util.Scanner;
public class Factorial_10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(fact(num));

	}
	
	public static int fact(int n) {
		if(n<=1)
			return 1;
		else
			return fact(n-1)*n;
	}

}
