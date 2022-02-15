package DynamicProgramming;
/*
 * DP��� : ���� �κк��� Ǯ�� �̹� ����� ���� �ִ� ��� �� �ٽ� ��� �ϴ� ���� �ƴ� �ش� ���� ��Ȱ��
 * �޸����̼�!!
 * >> �迭�� �̿��Ͽ� �ش� �迭�� ���� ���� ���� ���ȣ���� �ϰ�, ���� ��쿡�� �� ���� �ٷ� ����ϱ�
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
