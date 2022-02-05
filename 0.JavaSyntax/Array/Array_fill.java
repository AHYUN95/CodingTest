package Array;

import java.util.Arrays;
/*
 	배열을 사용할 때 for문을 돌지 않고 한꺼번에 초기화
 	특정 값을 모든 배열index에 넣을 때
 	Arrays.fill()

 */
public class Array_fill {

	public static void main(String[] args) {
		
		//<1차원 배열> 초기화
		int arr [] = new int [6];
		for(int i=0; i<3; i++) {
			arr[i] = 1;
		}
		
		//array.fill함수
		Arrays.fill(arr,-1);
		
		//만약 index 1~3에만 2로 채우고 싶을때
		//Arrays.fill(arr,처음인덱스, 끝인덱스+1, 값)
		Arrays.fill(arr, 1,4,-1);
		
		//<2차원 배열> 초기화
		
		int [][] arr2 = new int[6][6];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
			arr2[i][j] = 1;
		}
		
		//array.fill함수
		for(int i=0; i<6; i++) {
			Arrays.fill(arr2[i], '*');
		}
		
	}

}
