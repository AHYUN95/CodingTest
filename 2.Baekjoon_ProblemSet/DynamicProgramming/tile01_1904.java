package DynamicProgramming;


import java.util.Scanner;

public class tile01_1904 {
static int [] t = new int [1000001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(tile(n)); 
		/*
		 아래 30줄에 %15746말고 여기서 바로 %15746하면?
		 숫자가 너무 커서 난리날듯
		 */
		sc.close();
	}
		
	static int tile(int i) {
		//값이 있으면 그걸 바로 반환 Memoization
		if(t[i]!=0) {
			return t[i];
		}	
		//값 없으면 아래처럼
		if(i<=2) {
			return t[i] = i;
		}else
		return t[i] = (tile(i-1)+tile(i-2))%15746;
		//모듈러 연산 (A+B)%C=(A%C+B%C)%C 성립
	}
}
