package Sort;

import java.util.Arrays;
import java.util.Comparator;

/*
 static void sort(Object[] a) //객체 배열에 저장된 Comparable에 의한 정렬, 
 static void sort(Object[] a, Comparator c) // 지정한 Comparator(정렬기준)에 의한 정렬
 
 public interface Comparator{
 	int compare(Object o1, Object o2); // o1, o2를 비교
 	boolean equals(Object obj) ; // equals를 오버라이딩
 
 public interface Comparable{
 	int compareTo(Object o); // 주어진 객체(o)를 자신과 비교
 
 + 양수 : 왼쪽이 크다(두 요소의 위치를 바꿈), 0 : 같다, 음수 : 오른쪽이 크다(두 요소를 그대로.)
 + 숫자 : 오름차순, 문자 : 사전순
 
 +
compareTo 2개의 문자열을 비교하여 int형 값을 반환하는 메소드
A.compareTo(B)
A와 = B가 같으면 0을 반환
A가 > B보다 크면 양수를 반화
A가 < B보다 작으면 음수를 반환
 
 */
 
public class Comparator_ {

	public static void main(String[] args) {
		int [][] arr = new int [3][2];
		arr[0][0] = 1;
		arr[0][1] = 10;
		arr[1][0] = 5;
		arr[1][1] = 5;
		arr[2][0] = 3;
		arr[2][1] = 1;
		
		Arrays.sort(arr,new Comparator<int[]>() {
			@Override
			public int compare(int[] t1, int[] t2) {
				if(t1[0]==t2[0])
					return t1[1]-t2[1];		//0번째 인덱스가 같다면 1번째 인덱스 확인
				else
					return t1[0] - t2[0];
			}
		});

	}

}
