package Review;

import java.util.Arrays;

//Recursion >Star_2447
public class Baekjoon_2447 {

	public static void main(String[] args) {
		
		int num =6;
		char [][] arr = new char[num][num];
		
		for(int i=0; i<num; i++) {
			Arrays.fill(arr[i], ' ');
			}
		
		/*<오답부분>
		 arr의 자료형이 char이라서 행만 적어줘도 이차원배열을 다 출력
		 */
		for(int i=0; i<num; i++) {
			System.out.println(arr[i]);
			}
		
		
		/* <시간 초과> 틀림 ㅠ
		 
		 for(int i=0; i<num; i++){
		 	for(int j=0; j<num; j++){
		  		System.out.print(arr[i][j]);
		 	}System.out.println();
		  }
 				 int형은 저렇게 하면 주소값으로 나와서 오류남!(이경우 Stringbilder로 해서) 
		 */
	}

}
