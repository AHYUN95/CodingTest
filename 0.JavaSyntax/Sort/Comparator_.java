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
 
  + 양수 : 왼쪽이 크다, 0 : 같다, 음수 : 오른쪽이 크다
 *
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
