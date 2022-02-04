package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
input값이 많은 경우 Arrays.sort으로 풀면 시간 초과 날수도
시간 복잡도 : 평균 O(nlogn), 최악 O(n^2) 
Collection.Sort사용(Timsort)
: 삽입(최O(n) , 최악 O(n^2) )+ 합병정렬(최선, 최악 모두 O(nlogn)) 알고리즘을 사용
*/

public class NumberSorting2_2751 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list); /// 함수(오름차순 정리)
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(list.get(i)+"\n");
		}
		System.out.print(sb);

	}
}
