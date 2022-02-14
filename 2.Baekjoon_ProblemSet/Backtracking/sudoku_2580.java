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
			return;		//재귀함수에서 if는 끝나는 조건으로, 그리고 return에서 자기자신을 초훌
		}
	
		if(row==9) {
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					sb.append(rc[i][j]+" ");
				}sb.append("\n");
			}

			System.out.println(sb);
			System.exit(0); //return하면 상위 SDK함수로 돌아가기 때문에, 행,열 채워졌을때 프로그램 종료
		}
		
		//0 일경우 1-9중에 알맞은 숫자 구해준다.
		if(rc[row][col]==0) {
			for(int i=1; i<=9; i++) {
				//i값 중복 검사
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
		//행에 1-9 겹치는기 확인
		for(int i=0; i<9; i++) {
			if(rc[row][i]==value) return false;
		}
		
		for(int i=0; i<9; i++) {
			if(rc[i][col]==value) return false;
		}
		
		//3*3 확인 시작하는 부분
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