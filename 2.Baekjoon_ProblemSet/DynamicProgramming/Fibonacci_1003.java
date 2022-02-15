package DynamicProgramming;
/*
 * DP방식 : 작은 부분부터 풀되 이미 계산한 적이 있는 경우 또 다시 계산 하는 것이 아닌 해당 값을 재활용
 * 메모리제이션!!
 * >> 배열을 이용하여 해당 배열에 값이 없는 경우는 재귀호출을 하고, 있을 경우에는 그 값을 바로 사용하기
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Fibonacci_1003 {
	static int [] countZero = new int [41];
	static int [] countOne = new int [41];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCaseNum = Integer.parseInt(br.readLine());
		int [] testCase = new int [testCaseNum];
		
		for(int i =0; i<testCaseNum; i++) {
			testCase[i] = Integer.parseInt(br.readLine());
		}
		
		countZero[0] = 1;
		countZero[1] = 0;
		
		countOne[0] = 0;
		countOne[1] = 1;
		
		for(int i=2; i<41; i++) {
			countZero[i] = countZero[i-1] + countZero[i-2];
			countOne[i] = countOne[i-1] + countOne[i-2];
		}
		
		for(int i=0; i<testCaseNum; i++) {
			bw.write(countZero[testCase[i]]+" "+countOne[testCase[i]]+"\n");
		}
		bw.flush();
		bw.close();
	}


}
