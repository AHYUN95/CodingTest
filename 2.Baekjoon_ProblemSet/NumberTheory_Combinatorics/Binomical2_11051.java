package NumberTheory_Combinatorics;

import java.util.Scanner;

public class Binomical2_11051 {

	static Integer bc[][] ; 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		bc = new Integer [N+1][K+1];
		
		System.out.println(BC(N,K));
	}
	
	static int BC(int N, int K) {
		if(bc[N][K]==null) {
			if(K==0 || N==K) {
				return bc[N][K]=1;
			}else {
				bc[N][K] = (BC(N-1,K-1)+BC(N-1,K))%10007;
			}
		}return bc[N][K];
	}
}
