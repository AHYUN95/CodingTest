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
		//가장 2부터 가장 작은 값까지 증가하면서
		for(int i=2; i<=arr[0]; i++) {
			//전체 배열의 나머지 값을 idex에 저장해줌
			for(int j=0; j<N; j++) {
				idex[j] = arr[j]%i;
				}
			Arrays.sort(idex);
			//저장된 값들의 정렬해서 처음과 끝 값이 같으면 전체가 같은것
			// 같으면 값 출력
			if(idex[0]==idex[N-1]) {
				sb.append(i+" ");
			}
		}
		System.out.println(sb);
	}
		
}

