package TEST;

public class test1 {
	
	public static void main(String[] args) {
	int money = 4578;
	int [] costs = {1,4,99,35,50,1000};
	System.out.println(solution(money, costs));
	
	
	}
	static int solution (int money, int[] costs) {
		int answer =0;
		
		float index [][] = new float [6][2]; // [ȭ�����][1���� �ܰ�];
		
		index[0][0] = 1;
		index[1][0] = 5;
		index[2][0] = 10;
		index[3][0] = 50;
		index[4][0] = 100;
		index[5][0] = 500;
		
		
		index[0][1] = (float) costs[0]/1;
		index[1][1] = (float) costs[1]/5;
		index[2][1] = (float) costs[2]/10;
		index[3][1] = (float) costs[3]/50;
		index[4][1] = (float) costs[4]/100;
		index[5][1] = (float) costs[5]/500;
		
		//index �ι�° ��(1���� �ܰ�)�� �������� �������� ����
		for(int i=0; i<6; i++) {
			for(int j=i+1; j<6; j++) {
			if(index[i][1]>index[j][1]) {
				float temp = 0;
				float temp2 = 0;
				temp = index[i][1];
				temp2 = index[i][0];
				index[i][1] = index[j][1];
				index[i][0] = index[j][0];
				index[j][1] = temp;
				index[j][0] = temp2;
				}
			}
		}

		int value = money;
		int i=0;
		//1���� �ܰ��� ���� ������ �ִ��� ä���ش�.
		while(true) {
			answer += (value/(int)index[i][0])*(index[i][0]*index[i][1]); //���� ȭ������� ������			
			value = (int)value%(int)index[i][0]; // �������� value�� �־���

			if(value%index[i][0]==0) {
				break;
			}
			i++;
		}	
		return answer;
	}

}
