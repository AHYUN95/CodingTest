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
		sumMax = new Integer [num+1]; //StairSum�Լ� ���� �־� �ٲ���
		
		/*
		 * �ΰ��� ���� num���� �ְ� index 0���� �����ϴ� ���!!
		 * 0��° ��ܿ��� �ٷ� 2��° ������� �Ѿ���� ��찡 ���� �� ������,
		 * index 0�� 1��° ����̶�� ����� �������� ����~
		 */
		
		for(int i=1; i<=num; i++) {
			sarr[i] = Integer.parseInt(br.readLine());
		}
		
		//�ʱ�ȭ
		sumMax[0] = sarr[0];
		sumMax[1] = sarr[1];
		
		/*
		 * sumMax[2] = sarr[1] + sarr[2]
		 * �̷��� �����ָ� num�� 1�� input �� �� IndexOutofBound���� ����
		 */
		if(num>=2) {
		sumMax[2] = sarr[1]+sarr[2];
		}

		System.out.println(stairSum(num));
	}
	
	static int stairSum(int n) {
		
		if(sumMax[n]==null) {
			/*
			 * sumMax[n] == 0�� ���
			 * stairSum(0)�� �ʱ�ȭ�� ���ؼ� ���� 0�̴�.
			 * >>����Լ� ã���� stairSum(0-2).. �̷��� ã�Ƽ� IndexOutofBound����!
			 * �׷��� Integer�� �����ؼ� null�� �� ���� ������ ã���� **int�� null �� �Ұ���
			 */
			
			return sumMax[n] = Math.max(stairSum(n-2),stairSum(n-3)+sarr[n-1]) +sarr[n];
		}
		//���� �ִ� ��쿡�� �׳� �޸����̼� �� �� ���
		return sumMax[n];
	}

}
