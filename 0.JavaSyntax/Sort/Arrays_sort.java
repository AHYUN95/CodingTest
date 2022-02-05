package Sort;

import java.util.Arrays;
import java.util.Collections;
/*
 * �迭 ���� �ϱ� ���ؼ� sort() // ������������ ���ĵ�
 * ���ϰ� arr�� ���ĵǼ� arr�� ����Ŵ
 * �迭�� ������� ���� integer, string �������
 */
public class Arrays_sort {

	public static void main(String[] args) {
		
		//<���� ����>
		int [] arr = {5,2,4,3,1};
		Arrays.sort(arr);
		for(int i=0;i<5; i++)
		System.out.println(arr[i]); // 1,2,3,4,5
		
		/*<��������>
		int [] arr2 = {5,4,2,1,3};
		int�迭�� reverseOrder�Լ� ������ ���� Integer�� ����������
		���� : Arrays.sort(arr2,Collections.reverseOrder());
		 byte, char, int, long ���� Primitive Type �迭���� ������ �Ұ����Ͽ�
		 Integer, String ���� Wrapper Class�� �̿�
		*/
		Integer [] arr3 = {5,4,2,1,3};
		Arrays.sort(arr3,Collections.reverseOrder());
		
		String [] str = {"1","5","6","3","2","4"};
		Arrays.sort(str,Collections.reverseOrder());
		
	}

}
