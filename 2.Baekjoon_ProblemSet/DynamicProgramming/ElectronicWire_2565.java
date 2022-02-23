package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class ElectronicWire_2565 {
	
	static int num ;
	static int [][] arr;
	static Integer [] w;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		num = Integer.parseInt(br.readLine());
		
		arr = new int [num][2];
		for(int i=0; i<num; i++) {
			String [] s = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(s[0]);
			arr[i][1] = Integer.parseInt(s[1]);
		}
		
		Arrays.sort(arr, new Comparator <int[]> () {
			@Override
			public int compare(int[] a1, int [] a2) {
				return a1[0]-a2[0];
			}
		});
		
		w = new Integer[num];
		
		w[num-1] = 1;//�������� null���̶�� ������
		
		for(int i=0; i<num; i++) {
			w(i);
		}
		
		Arrays.sort(w);
		//��ü �������� �ִ� ������ ������ ��
		System.out.println(num-w[num-1]);
	}
	//n���� �����Ҷ� ��ġ�� �ʴ� �� arr �ι��� �迭�� ���������̵��� ���� �� ��, 0~Num-1
	static int w(int n) {
		
		if(w[n]==null) {
			w[n] = 1;
		for(int i=n+1; i<num; i++) {
			if(arr[n][1]<arr[i][1]) {
				w[n] = Math.max(w[n],w(i)+1);
				}
			}
		}return w[n];
}
}
