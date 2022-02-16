package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RGB_1149 {
	
static int [][] arr; // input�޴� ��
static int [][] cost;//�Ʒ� Cost�Լ� ���� �������� �迭
static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int [n][3]; //cost[���°��][����]
		for(int i=0; i<n; i++) {
			String [] str = br.readLine().split(" ");
			for(int j=0; j<3; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		cost = new int [n+1][3];
		
		int min = Math.min(Cost(n,0),Math.min(Cost(n,1), Cost(n,2)));
		System.out.println(min);

	}
	//n��°��, lastcol ������ ����
	static int Cost(int n, int lastcol) {
		
		if(cost[n][lastcol]!=0) {
			return cost[n][lastcol];
		}
		
		//������ ���� ���� �տ� �ٸ� ���� �ΰ����� ���ؼ� ���� ���� �����ָ� �ȴ�.
		if(n==1) {
			return cost[n][lastcol] = arr[n-1][lastcol];
		}else {
			if(lastcol==1)
				return cost[n][lastcol] =Math.min(Cost(n-1, 0),Cost(n-1,2))+ arr[n-1][lastcol];
			else if(lastcol==2)
				return cost[n][lastcol] =Math.min(Cost(n-1, 0),Cost(n-1,1))+ arr[n-1][lastcol];
			else
				return cost[n][lastcol] =Math.min(Cost(n-1,1), Cost(n-1,2))+arr[n-1][lastcol]; 
		}

	}

	
}