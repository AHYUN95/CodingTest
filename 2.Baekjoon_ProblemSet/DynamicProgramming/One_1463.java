package DynamicProgramming;

import java.util.Scanner;

public class One_1463 {

	static Integer [] arr;
	static int count;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		
		arr = new Integer [X+1];
		arr[0] = 0;
		arr[1] = 0;
		
		System.out.println(Count(X));

	}
	
	static int Count(int n) {
		//���� ū���� �����ٰ� �ּڰ��� �ƴ�! �׷��� ������ �ִ� �� + -1 �Ҷ� �� �ּڰ��� �����ؼ� ���
		if(arr[n] == null) {	
			if(n%6==0) {	
				return arr[n] = Math.min(Count(n-1),Math.min(Count(n/3),Count(n/2))) + 1;
			}else if (n%3==0) {
				return arr[n] = Math.min(Count(n/3),Count(n-1))+1;
			}else if (n%2==0) {
				return arr[n] = Math.min(Count(n/2),Count(n-1))+1;
			}else
				return arr[n] = Count(n-1) + 1;
		}
		return arr[n];
	}

}
