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
	//��� ���� �� ä��� count �߰� > ����� �� 1�� üũ
	if(depth==N) {
		count++;
		return;
	}
	for(int i=0; i<N; i++) {
		arr[depth] = i; //depth���� i�࿡�� �����ٸ� �ǹ�
		//���� �� �ִ� ��� ���ȣ��
		if(Possibillity(depth)) {
		nQueen(depth+1);
		}
	}
}
public static boolean Possibillity(int col) {
	
	for(int i=0; i<col; i++) {//���� ���鿡 ���ؼ�
		if(arr[col]==arr[i]) //���� ���� ������ ������ false 
			return false; 
	else if (Math.abs(arr[col]-arr[i])==Math.abs(col-i)) return false;
	//�밢���� ��ġ�ϴ� ��� : ���� ���� ���� ���� ���� ��� �밢�� ��ġ
	}
	return true;

	}
}
