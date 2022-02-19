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
		
		//0�ڸ����� 0 ���� �ʱ�ȭ 
		//1�ڸ����� 1�� �ʱ�ȭ, ����� ���� ī��Ʈ ���� ��
		for(int i=0; i<10; i++) {
			dp[0][i] = 0L;
			dp[1][i] = 1L;
		}
		
		long result = 0;
		
		//���� �ϴ� ���� 1���� 9����
		for(int i=1; i<10; i++) {
			result += dp(N,i);
		}
		
		System.out.print(result%1000000000);
	}
	
	//num�� �����ϴ� �� 
	static long dp(int digit, int num) {
		//long, int�� null �� �Ұ�, Long Integer null�� ����
		if(dp[digit][num]==null) {
			if(num==0) {
				return dp[digit][num] = dp(digit-1,1);
			}else if (num==9) {
				return dp[digit][num] = dp(digit-1,8);
			}else {
				return dp[digit][num] = dp(digit-1,num+1) + dp(digit-1, num-1);
			}
		}
		//������� longŸ�� ���� ����� return���� 10�� ������ �ֱ�
		//��ⷯ ����! ((a%r)+(b%r))%r = (a+b)%c
		return dp[digit][num]%1000000000;
	}
}