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
		int count = 0; // 동전 몇개 사용했는지 count
		
		for(int i=0; i<N; i++) {
			carr[i] = Integer.parseInt(br.readLine());
		}
		
		int re = K; //남은 값
		for(int i=N-1; i>=0; i--) {
			if(re >= carr[i]) {
				count += re/carr[i]; // 몫만큼 동전 수가 필요
				re = re%carr[i]; 
				/*
				 * re = re%carr[i]; 
				 * count += re/carr[i];
				 * >> 이렇게 했다가 틀림ㅠ re값이 윗줄에서 바뀌기 때문에 count가 제대로 안된다. 
				 * 생각**하고 풀기!
				*/
			}
		}
		System.out.println(count);
	}

}
