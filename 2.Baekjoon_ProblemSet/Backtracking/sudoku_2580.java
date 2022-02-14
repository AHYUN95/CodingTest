package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sudoku_2580 {

static int [][] rc;
static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		rc = new int [9][9];
		
		for(int i=0; i<9; i++) {
			String [] rowsplit = br.readLine().split(" ");
			for(int j=0; j<9; j++) {
				rc[i][j] = Integer.parseInt(rowsplit[j]);
			}
		}
		
		SDK(0,0);

}

	public static void SDK(int row, int col) {
		if(col==9) {
			SDK(row+1, 0);
			return;		//����Լ����� if�� ������ ��������, �׸��� return���� �ڱ��ڽ��� ����
		}
	
		if(row==9) {
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					sb.append(rc[i][j]+" ");
				}sb.append("\n");
			}

			System.out.println(sb);
			System.exit(0); //return�ϸ� ���� SDK�Լ��� ���ư��� ������, ��,�� ä�������� ���α׷� ����
		}
		
		//0 �ϰ�� 1-9�߿� �˸��� ���� �����ش�.
		if(rc[row][col]==0) {
			for(int i=1; i<=9; i++) {
				//i�� �ߺ� �˻�
				if(Possibility(row,col,i)) {
					rc[row][col]=i;
					SDK(row,col+1);
				}
			}
			rc[row][col]=0;
			return;
		}
		SDK(row,col+1);
	}

	
	
	public static boolean Possibility(int row, int col, int value) {
		//�࿡ 1-9 ��ġ�±� Ȯ��
		for(int i=0; i<9; i++) {
			if(rc[row][i]==value) return false;
		}
		
		for(int i=0; i<9; i++) {
			if(rc[i][col]==value) return false;
		}
		
		//3*3 Ȯ�� �����ϴ� �κ�
		int start_row = (row/3)*3;
		int start_col = (col/3)*3;
		
		for(int i=start_row; i<start_row+3; i++) {
			for(int j=start_col; j<start_col+3; j++) {
				if(rc[i][j]==value) return false;
			}
		}
		return true;
	}
}