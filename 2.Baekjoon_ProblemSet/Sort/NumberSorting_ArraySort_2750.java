package Sort;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
//import java.util.Collections;
import java.io.IOException;


public class NumberSorting_ArraySort_2750{
	//���� 2750, ArraySort
	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int [N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr); // �Լ�(�������� ����)
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(arr[i]+"\n");
		}
		System.out.print(sb);
		/*
		*������������ ǥ��
		*arr�� int �� ��� ���� �߻�
		*Integer [] arr = new Integer [] arr;
		*Arrays.sort(arr,Collections.reverseOrder());
		*/
	}
}
