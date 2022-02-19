package DynamicProgramming;

import java.util.Scanner;

public class easyStairs {

	static Long dp [][];
	static int N;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		sc.close();
		
		dp = new Long[N+1][10];
		
		//0자리수는 0 으로 초기화 
		//1자리수는 1로 초기화, 경우의 수로 카운트 해줄 꺼
		for(int i=0; i<10; i++) {
			dp[0][i] = 0L;
			dp[1][i] = 1L;
		}
		
		long result = 0;
		
		//시작 하는 수가 1부터 9까지
		for(int i=1; i<10; i++) {
			result += dp(N,i);
		}
		
		System.out.print(result%1000000000);
	}
	
	//num은 시작하는 수 
	static long dp(int digit, int num) {
		//long, int는 null 비교 불가, Long Integer null비교 가능
		if(dp[digit][num]==null) {
			if(num==0) {
				return dp[digit][num] = dp(digit-1,1);
			}else if (num==9) {
				return dp[digit][num] = dp(digit-1,8);
			}else {
				return dp[digit][num] = dp(digit-1,num+1) + dp(digit-1, num-1);
			}
		}
		//결과값이 long타입 범위 벗어나서 return부터 10억 나누어 주기
		//모듈러 연산! ((a%r)+(b%r))%r = (a+b)%c
		return dp[digit][num]%1000000000;
	}
}