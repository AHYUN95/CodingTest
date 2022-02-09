package Sort;

import java.util.Arrays;
import java.util.Comparator;

/*
 static void sort(Object[] a) //��ü �迭�� ����� Comparable�� ���� ����, 
 static void sort(Object[] a, Comparator c) // ������ Comparator(���ı���)�� ���� ����
 
 public interface Comparator{
 	int compare(Object o1, Object o2); // o1, o2�� ��
 	boolean equals(Object obj) ; // equals�� �������̵�
 
 public interface Comparable{
 	int compareTo(Object o); // �־��� ��ü(o)�� �ڽŰ� ��
 
  + ��� : ������ ũ��, 0 : ����, ���� : �������� ũ��
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
					return t1[1]-t2[1];		//0��° �ε����� ���ٸ� 1��° �ε��� Ȯ��
				else
					return t1[0] - t2[0];
			}
		});

	}

}
