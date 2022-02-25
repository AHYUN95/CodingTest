package DynamicProgramming;

import java.util.Scanner;

public class LCS_9251 {

	
	static char c1 [];
	static char c2 [];
	static Integer dp [][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		c1 = sc.nextLine().toCharArray();
		c2 = sc.nextLine().toCharArray();
		
		sc.close();
		
		dp = new Integer[c1.length][c2.length];
		
		
		System.out.println(LCS(c1.length-1, c2.length-1));

	}
	
	//몇번째 c1에서 n번째 인덱스에 대해서 c2의 s번째 인덱스에서 부터 서치 
	static int LCS(int x, int y) {
		
		if(x==-1 || y==-1) {
			return 0;
		}

		if(dp[x][y]==null) {
			dp[x][y] = 0;
			//간혹 값이 아닌 null을 참고하게 되어 잘못 연산 할 수 있어서 일단 0으로 초기화
			//적지 않아도 잘 돌아감
			if(c1[x]==c2[y]) {
				dp[x][y] = LCS(x-1,y-1) + 1;
				//LCS(x,y-1) +1 >> 이렇게 하면 같은 글자가 반복하는 경우 카운트가 2개 된다.
				//A > CAPCAP // A가 같을 때 두번 더해짐
			}else
				dp[x][y] = Math.max(LCS(x-1,y), LCS(x,y-1));
			}
		
		return dp[x][y];
		}			
	}
