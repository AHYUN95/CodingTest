package Sort;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
//import java.util.Collections;
import java.io.IOException;


public class NumberSorting_ArraySort_2750{
	//백준 2750, ArraySort
	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int [N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr); // 함수(오름차순으로 정리)
		System.out.print(arr);
		/*
		*내림차순으로 표현
		*arr가 int 인 경우 오류 발생
		*Integer [] arr = new Integer [] arr;
		*Arrays.sort(arr,Collections.reverseOrder());
		*/
	}
}
