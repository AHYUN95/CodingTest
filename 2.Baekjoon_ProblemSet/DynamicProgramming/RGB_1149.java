package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RGB_1149 {
	
static int [][] arr; // input받는 것
static int [][] cost;//아래 Cost함수 값들 저장해줄 배열
static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int [n][3]; //cost[몇번째집][색깔]
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
	//n번째집, lastcol 마지막 색깔
	static int Cost(int n, int lastcol) {
		
		if(cost[n][lastcol]!=0) {
			return cost[n][lastcol];
		}
		
		//마지막 색깔 별로 앞에 다른 색깔 두가지를 비교해서 작은 값과 더해주면 된다.
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