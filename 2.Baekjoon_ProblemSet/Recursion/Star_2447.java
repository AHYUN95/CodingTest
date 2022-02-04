package Recursion;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException; 

public class Star_2447 {
//����2447��
	public static char[][]arr;

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		//Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		//sc.close();
		
		arr = new char[num][num];
		
		for(int i=0; i<num; i++) {
			Arrays.fill(arr[i], ' ');
		}
		
		Star(num, 0, 0);
		
		for(int i=0; i<num; i++) {
			System.out.println(arr[i]);
	}
		//�Ʒ�ó�� �ص� ������ �������� �ð� �ʰ��ʤ�
		/* 
		 * for(int i=0; i<num; i++){
		 * 	for(int j=0; j<num; j++){
		 * 		System.out.print(arr[i][j]);
		 * }System.out.println();
		 * }
		 * 
		 */
		
		
		
	}
	
	//input n ��, ���� x, y��
	public static void Star(int n, int x, int y) {
		if(n==1) {
			arr[x][y] ='*';
			return;			//�޼ҵ� ����
		}
		int value = n/3; // ���� ũ��
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++) {
				if(i==1 && j==1)
					continue;		//����� �Ծ��ְ�
				else
					Star(value,x+(value*i),y+(value*j)); //ä���ְ�
			}
		}
		
	}
	

}