package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class coin_11047 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		
		int carr [] = new int [N];
		int count = 0; // ���� � ����ߴ��� count
		
		for(int i=0; i<N; i++) {
			carr[i] = Integer.parseInt(br.readLine());
		}
		
		int re = K; //���� ��
		for(int i=N-1; i>=0; i--) {
			if(re >= carr[i]) {
				count += re/carr[i]; // ��ŭ ���� ���� �ʿ�
				re = re%carr[i]; 
				/*
				 * re = re%carr[i]; 
				 * count += re/carr[i];
				 * >> �̷��� �ߴٰ� Ʋ���� re���� ���ٿ��� �ٲ�� ������ count�� ����� �ȵȴ�. 
				 * ����**�ϰ� Ǯ��!
				*/
			}
		}
		System.out.println(count);
	}

}
