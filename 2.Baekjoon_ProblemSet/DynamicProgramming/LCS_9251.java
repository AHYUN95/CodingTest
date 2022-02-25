package DynamicProgramming;

import java.util.Scanner;

public class LCS_9251 {

	
	static char c1 [];
	static char c2 [];
	static Integer dp [][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		c1 = sc.nextLine().toCharArray();
		c2 = sc.nextLine().toCharArray();
		
		sc.close();
		
		dp = new Integer[c1.length][c2.length];
		
		
		System.out.println(LCS(c1.length-1, c2.length-1));

	}
	
	//���° c1���� n��° �ε����� ���ؼ� c2�� s��° �ε������� ���� ��ġ 
	static int LCS(int x, int y) {
		
		if(x==-1 || y==-1) {
			return 0;
		}

		if(dp[x][y]==null) {
			dp[x][y] = 0;
			//��Ȥ ���� �ƴ� null�� �����ϰ� �Ǿ� �߸� ���� �� �� �־ �ϴ� 0���� �ʱ�ȭ
			//���� �ʾƵ� �� ���ư�
			if(c1[x]==c2[y]) {
				dp[x][y] = LCS(x-1,y-1) + 1;
				//LCS(x,y-1) +1 >> �̷��� �ϸ� ���� ���ڰ� �ݺ��ϴ� ��� ī��Ʈ�� 2�� �ȴ�.
				//A > CAPCAP // A�� ���� �� �ι� ������
			}else
				dp[x][y] = Math.max(LCS(x-1,y), LCS(x,y-1));
			}
		
		return dp[x][y];
		}			
	}
