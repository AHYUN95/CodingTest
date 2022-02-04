package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

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
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list); /// �Լ�(�������� ����)
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(list.get(i)+"\n");
		}
		System.out.print(sb);

	}
}
