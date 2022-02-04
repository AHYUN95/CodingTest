package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Statistic_2108 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		//Counting Sort
		int [] arr = new int [8001];
		
		for(int i=0; i<N; i++) {
			arr[Integer.parseInt(br.readLine())+4000]++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<8001; i++) {
			if(arr[i]>0) {
				for(int j=0; j<arr[i]; j++)
				sb.append(i-4000 + " ");
			}
		}
		//�Է� ���� ���� Sort
		String [] sort = String.valueOf(sb).split(" ");
		
		
		//<������>
		int sum =0;
		for(int i=0; i<N; i++) {
			sum += Integer.parseInt(sort[i]);
		}
		float avg = (float)sum/N;
		System.out.printf("%.0f%n",avg);
		
		//<�߾Ӱ�>

		System.out.println(sort[(N-1)/2]);

		//<�ֺ�>
		
		if(N==1) {
			System.out.println(sort[0]);
		}
		else{
		//�ֺ��� count�� ã��
		int mode = 1;
		for(int i=0; i<8001; i++) {
			if(mode <= arr[i]) {
				mode = arr[i];
			}
		}
		
		//�ֺ󰪵��� string���� ����, ���� ���� 1���� ��������
		StringBuilder sb2 = new StringBuilder();
		for(int i=0; i<8001; i++) {
			if(arr[i]==mode) sb2.append(i-4000 +" ");
		}
	
		//�ֺ��� �Ѱ� �� ��� �ε��� 0 �� ��� �ֺ��� 2���� ��� �ε��� 1�� ���
		String [] sort2 = String.valueOf(sb2).split(" ");
		if(sort2.length>1) {
			System.out.println(sort2[1]);
		}else
			System.out.println(sort2[0]);
		
		}		
		//<���� ���>
		System.out.println(Integer.parseInt(sort[N-1])-Integer.parseInt(sort[0]));

	}
}
