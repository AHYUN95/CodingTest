package NumberTheory_Combinatorics;

import java.util.Scanner;

public class Binomical1_11050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		//ºÐÀÚ
		int m = 1;
		for(int i=N; i>N-K; i--) {
			m *= i;
		}
		
		int f = 1;
		for(int i=K; i>0; i--) {
			f *= i;
		}

		System.out.println(m/f);
	}

}
