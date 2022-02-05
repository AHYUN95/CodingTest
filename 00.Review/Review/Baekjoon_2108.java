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
		
		
		//<최빈값>
		
		if(N==1) {
			System.out.println(sort[0]);
		}
		else{
		//최빈값의 count수 찾기
		int mode = 1;
		for(int i=0; i<8001; i++) {
			if(mode <= arr[i]) {//<오답>
				mode = arr[i];
			}
		}
		
		//TEST
		System.out.println(mode);
		
		/*
		  <오답>
		  	for(int i=0; i<8001; i++) {
			if(arr[i] <= arr[i+1]) {
				mode = arr[i];
			
			> 
				만약 arr = {1,2,3,1,2}
				arr[2]까지 for문을 돌았을때는 3이 mode에 들어감
				arr[3]일 경우에 arr[3]=1,arr[4]=2, mode에 2가 덮어씌여짐
				>> arr[i]<=arr[i+1] >> mode < arr[i+1]
				비교값(mode)을 조건에 넣어줘야 함!!!!
		 */
		
	}
	}
}