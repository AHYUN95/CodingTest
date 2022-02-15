package DynamicProgramming;


import java.util.Scanner;

public class tile01_1904 {
static int [] t = new int [1000001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(tile(n)); 
		/*
		 �Ʒ� 30�ٿ� %15746���� ���⼭ �ٷ� %15746�ϸ�?
		 ���ڰ� �ʹ� Ŀ�� ��������
		 */
		sc.close();
	}
		
	static int tile(int i) {
		//���� ������ �װ� �ٷ� ��ȯ Memoization
		if(t[i]!=0) {
			return t[i];
		}	
		//�� ������ �Ʒ�ó��
		if(i<=2) {
			return t[i] = i;
		}else
		return t[i] = (tile(i-1)+tile(i-2))%15746;
		//��ⷯ ���� (A+B)%C=(A%C+B%C)%C ����
	}
}
