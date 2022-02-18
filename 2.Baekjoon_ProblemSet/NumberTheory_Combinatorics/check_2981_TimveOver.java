package NumberTheory_Combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class check_2981_TimveOver {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int arr [] = new int [N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int idex [] = new int [N];
		//���� 2���� ���� ���� ������ �����ϸ鼭
		for(int i=2; i<=arr[0]; i++) {
			//��ü �迭�� ������ ���� idex�� ��������
			for(int j=0; j<N; j++) {
				idex[j] = arr[j]%i;
				}
			Arrays.sort(idex);
			//����� ������ �����ؼ� ó���� �� ���� ������ ��ü�� ������
			// ������ �� ���
			if(idex[0]==idex[N-1]) {
				sb.append(i+" ");
			}
		}
		System.out.println(sb);
	}
		
}

