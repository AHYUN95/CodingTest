package Sort;

import java.util.Arrays;
import java.util.Collections;
/*
 * 배열 정렬 하기 위해서 sort() // 오름차순으로 정렬됨
 * 리턴값 arr가 정렬되서 arr를 가르킴
 */
public class Arrays_sort {

	public static void main(String[] args) {
		
		// <오름 차순>
		int [] arr = {5,2,4,3,1};
		Arrays.sort(arr);
		for(int i=0;i<5; i++)
		System.out.println(arr[i]); // 1,2,3,4,5
		
		//<내림차순>
		//int [] arr2 = {5,4,2,1,3};
		//int배열은 reverseOrder함수 오류가 나서 Integer을 사용해줘야함
		//오류 : Arrays.sort(arr2,Collections.reverseOrder());
		
		Integer [] arr3 = {5,4,2,1,3};
		Arrays.sort(arr3,Collections.reverseOrder());
		
		String [] str = {"1","5","6","3","2","4"};
		Arrays.sort(str,Collections.reverseOrder());
		
	}

}
