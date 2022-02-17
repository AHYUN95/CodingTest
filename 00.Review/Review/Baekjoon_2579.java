package Review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2579 {

	static int [] sarr;
	static Integer [] sumMax;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		sarr = new int [num+1];
		sumMax = new Integer [num+1]; //StairSum함수 값들 넣어 줄꺼임
		
		/*
		 * 두개를 길이 num으로 주고 index 0부터 시작하는 경우!!
		 * 0번째 계단에서 바로 2번째 계단으로 넘어오는 경우가 있을 수 있으니,
		 * index 0을 1번째 계단이라고 맘대로 생각하지 말자~
		 */
		
		for(int i=1; i<=num; i++) {
			sarr[i] = Integer.parseInt(br.readLine());
		}
		
		//초기화
		sumMax[0] = sarr[0];
		sumMax[1] = sarr[1];
		
		/*
		 * sumMax[2] = sarr[1] + sarr[2]
		 * 이렇게 적어주면 num이 1로 input 할 때 IndexOutofBound오류 생김
		 */
		if(num>=2) {
		sumMax[2] = sarr[1]+sarr[2];
		}

		System.out.println(stairSum(num));
	}
	
	static int stairSum(int n) {
		
		if(sumMax[n]==null) {
			/*
			 * sumMax[n] == 0일 경우
			 * stairSum(0)은 초기화로 인해서 값이 0이다.
			 * >>재귀함수 찾을때 stairSum(0-2).. 이렇게 찾아서 IndexOutofBound생김!
			 * 그래서 Integer로 선언해서 null로 비교 값이 없을때 찾도록 **int는 null 비교 불가능
			 */
			
			return sumMax[n] = Math.max(stairSum(n-2),stairSum(n-3)+sarr[n-1]) +sarr[n];
		}
		//값이 있는 경우에는 그냥 메모리제이션 된 값 출력
		return sumMax[n];
	}

}
