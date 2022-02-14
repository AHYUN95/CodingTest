package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen_9664{

public static int[] arr;
public static int N;
public static int count = 0;

public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	N = Integer.parseInt(br.readLine());
	arr = new int[N];
	
	nQueen(0);
	
	System.out.println(count);
}


public static void nQueen (int depth) {
	//모든 열을 다 채우면 count 추가 > 경우의 수 1개 체크
	if(depth==N) {
		count++;
		return;
	}
	for(int i=0; i<N; i++) {
		arr[depth] = i; //depth열에 i행에는 들어가진다를 의미
		//놓을 수 있는 경우 재귀호출
		if(Possibillity(depth)) {
		nQueen(depth+1);
		}
	}
}
public static boolean Possibillity(int col) {
	
	for(int i=0; i<col; i++) {//이전 열들에 대해서
		if(arr[col]==arr[i]) //행의 값이 같은게 있으면 false 
			return false; 
	else if (Math.abs(arr[col]-arr[i])==Math.abs(col-i)) return false;
	//대각선에 위치하는 경우 : 행의 차와 열의 차가 같은 경우 대각선 위치
	}
	return true;

	}
}
