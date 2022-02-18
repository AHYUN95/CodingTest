package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ATM_11399 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String [] str = br.readLine().split(" ");
		int arr [] = new int [N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(arr);
		
		//�ð� ª�� �ͺ��� ATM����
		int time [] = new int[N];
		time[0] = arr[0]; 
		int sum = 0;
		
		
		for(int i=1; i<N; i++) {
			time[i] = arr[i] +time[i-1];
		}

		//time ��ü ��
		for(int i=0; i<N; i++) {
			sum+= time[i];
		}
		
		/*
		 ���� for �� �ΰ� �����°� �����ϱ� �̷��� ����... (�޸� �ð� ���̴� ���� �ȳ���.!) 
		 int sum = arr[0];
		 for (int i=1;i<N;i++){
		 time[i] = arr[i] +time[i-1];
		 sum+= time[i];
		 }
		 */
		System.out.println(sum);
	}

}
