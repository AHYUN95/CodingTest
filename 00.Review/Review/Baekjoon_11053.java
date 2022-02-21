package Review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_11053 {

	static int arr[];
	static Integer dp [];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String s [] = br.readLine().split(" ");
		arr = new int [N+1];
		for(int i=1; i<N+1; i++) {
			arr[i] = Integer.parseInt(s[i-1]);
		}
		
		dp = new Integer [N+1];
		dp[0] = 0;
		dp[1] = 1;

		for(int i=2; i<=N; i++) {
			dp(i);
		}
		
		int max = 0;
		for(int i=1; i<=N; i++) {
			max = Math.max(max,dp[i]);
		}
		
		System.out.println(max);

	}
	
	static int dp(int n) {
		if(dp[n] == null) {
			dp[n]=1;
			/*
			 * dp[n]=1;을 초기화 해주기 않으면 
			 * 50줄에 있는 math.max 함수 사용시 dp[n] 값이 없어서 null이 나올 수 있다.
			 */
			for(int i=n-1; i>0; i--) {
				if(arr[i] < arr[n]) {
					//dp[n] 앞선 값과 , 다시 탐색한 dp(i)+1중에 큰 값을 반환한다.
					dp[n] = Math.max(dp[n],dp(i)+1);
					//return dp[n] = Math.max(dp[n]=Math.max(dp[n],dp(i)+1);
					/*
					 *이경우 if를 만족하는 첫번째에서 return되면서 for이 끝남
					 *재귀에서 return은 그냥 break;라고 보면된다.
					 *그래서 max값을 구할 수가 없음 return없앨것!
					 */
				}
			}
		}
		return dp[n];
	}
}
