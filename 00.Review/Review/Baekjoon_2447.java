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
		
		/*<����κ�>
		 arr�� �ڷ����� char�̶� �ุ �����൵ �������迭�� �� ���
		 */
		for(int i=0; i<num; i++) {
			System.out.println(arr[i]);
			}
		
		
		/* <�ð� �ʰ�> Ʋ�� ��
		 
		 for(int i=0; i<num; i++){
		 	for(int j=0; j<num; j++){
		  		System.out.print(arr[i][j]);
		 	}System.out.println();
		  }
 				 int���� ������ �ϸ� �ּҰ����� ���ͼ� ������!(�̰�� Stringbilder�� �ؼ�) 
		 */
	}

}
