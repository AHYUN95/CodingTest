package Array;

import java.util.Arrays;
/*
 	�迭�� ����� �� for���� ���� �ʰ� �Ѳ����� �ʱ�ȭ
 	Ư�� ���� ��� �迭index�� ���� ��
 	Arrays.fill()

 */
public class Array_fill {

	public static void main(String[] args) {
		
		//<1���� �迭> �ʱ�ȭ
		int arr [] = new int [6];
		for(int i=0; i<3; i++) {
			arr[i] = 1;
		}
		
		//array.fill�Լ�
		Arrays.fill(arr,-1);
		
		//���� index 1~3���� 2�� ä��� ������
		//Arrays.fill(arr,ó���ε���, ���ε���+1, ��)
		Arrays.fill(arr, 1,4,-1);
		
		//<2���� �迭> �ʱ�ȭ
		
		int [][] arr2 = new int[6][6];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
			arr2[i][j] = 1;
		}
		
		//array.fill�Լ�
		for(int i=0; i<6; i++) {
			Arrays.fill(arr2[i], '*');
		}
		
	}

}
