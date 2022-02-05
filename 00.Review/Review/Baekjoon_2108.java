package Review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2108 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int [8001];
		for(int i=0; i<N; i++) arr[Integer.parseInt(br.readLine())+4000]++;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<8001; i++) {
			if(arr[i]>0) {
				for(int j=0; j<arr[i]; j++)
				sb.append(i-4000 + " ");
			}
		}
		String [] sort = String.valueOf(sb).split(" ");
		
		
		//<�ֺ�>
		
		if(N==1) {
			System.out.println(sort[0]);
		}
		else{
		//�ֺ��� count�� ã��
		int mode = 1;
		for(int i=0; i<8001; i++) {
			if(mode <= arr[i]) {//<����>
				mode = arr[i];
			}
		}
		
		//TEST
		System.out.println(mode);
		
		/*
		  <����>
		  	for(int i=0; i<8001; i++) {
			if(arr[i] <= arr[i+1]) {
				mode = arr[i];
			
			> 
				���� arr = {1,2,3,1,2}
				arr[2]���� for���� ���������� 3�� mode�� ��
				arr[3]�� ��쿡 arr[3]=1,arr[4]=2, mode�� 2�� �������
				>> arr[i]<=arr[i+1] >> mode < arr[i+1]
				�񱳰�(mode)�� ���ǿ� �־���� ��!!!!
		 */
		
	}
	}
}