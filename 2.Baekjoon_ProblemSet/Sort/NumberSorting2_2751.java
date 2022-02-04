package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;

/*
input���� ���� ��� Arrays.sort���� Ǯ�� �ð� �ʰ� ������
�ð� ���⵵ : ��� O(nlogn), �־� O(n^2) 
Collection.Sort���(Timsort)
: ����(��O(n) , �־� O(n^2) )+ �պ�����(�ּ�, �־� ��� O(nlogn)) �˰����� ���
*/

public class NumberSorting2_2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int [N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//Collection.sort(arr); /// �Լ�(�������� ����)
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(arr[i]+"\n");
		}
		System.out.print(sb);

	}
}
