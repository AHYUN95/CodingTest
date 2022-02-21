package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class longestBitonic_11054 {

	static int [] arr;
	static Integer [] aes;
	static Integer [] des;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String str [] = br.readLine().split(" ");
		arr = new int [N+1];
		
		for(int i=1; i<=N; i++) {
			arr[i] = Integer.parseInt(str[i-1]);
		}
		
		aes = new Integer [N+1];
		des = new Integer [N+1];
		aes[1] = 1;
		des[N] = 1;
		
		for(int i=1; i<=N; i++) {
			aes(i);
			des(i);
		}
		
		int max = 0;
		for(int i=1; i<=N; i++) {
			max = Math.max(aes[i]+des[i], max);
		}
		
		//aes+des ���ϸ� n�ϰ�찡 2�� �� ������ �׷��� 1����.
		System.out.println(max-1);


	}
	//���ϴ� ������ n�� ���, arr�� 1~n���� �����Ѵ�.
	static int aes(int n) {
		if(aes[n]==null) {
			aes[n] = 1;
			for(int i=n-1; i>0 ;i--) {
				if(arr[i]<arr[n]) {
					aes[n] = Math.max(aes[n], aes(i)+1);
				}
			}
		}
		return aes[n];
	}
	
	//arr�� n~ d.length���� �����Ѵ�.
	static int des(int n) {
		if(des[n]==null) {
			des[n]=1;
			for(int i=n; i<arr.length; i++) {
				if(arr[i]<arr[n]) {
					des[n] = Math.max(des[n], des(i)+1);
				}
			}
		}
		return des[n];
	}
}
