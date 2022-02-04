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
		//입력 받은 값을 Sort
		String [] sort = String.valueOf(sb).split(" ");
		
		
		//<산술평균>
		int sum =0;
		for(int i=0; i<N; i++) {
			sum += Integer.parseInt(sort[i]);
		}
		float avg = (float)sum/N;
		System.out.printf("%.0f%n",avg);
		
		//<중앙값>

		System.out.println(sort[(N-1)/2]);

		//<최빈값>
		
		if(N==1) {
			System.out.println(sort[0]);
		}
		else{
		//최빈값의 count수 찾기
		int mode = 1;
		for(int i=0; i<8001; i++) {
			if(mode <= arr[i]) {
				mode = arr[i];
			}
		}
		
		//최빈값들을 string으로 정리, 같은 값은 1개만 나오도록
		StringBuilder sb2 = new StringBuilder();
		for(int i=0; i<8001; i++) {
			if(arr[i]==mode) sb2.append(i-4000 +" ");
		}
	
		//최빈값이 한개 일 경우 인덱스 0 값 출력 최빈값이 2개인 경우 인덱스 1값 출력
		String [] sort2 = String.valueOf(sb2).split(" ");
		if(sort2.length>1) {
			System.out.println(sort2[1]);
		}else
			System.out.println(sort2[0]);
		
		}		
		//<범위 출력>
		System.out.println(Integer.parseInt(sort[N-1])-Integer.parseInt(sort[0]));

	}
}
