package Codeu_ProblemSet;
import java.util.Scanner;
public class code_0201_1093_1099 {

	//1093 1���� �迭 �⼮�θ���1
	public static void main1093 (String[] args) {
		Scanner sc93 = new Scanner(System.in);
		int num93 = sc93.nextInt();
		int [] array93 = new int [23];
		for(int i93=0; i93<num93; i93++) {
			int called = sc93.nextInt();
			array93[called-1]++;
		}
		for(int i93=0; i93<22 ;i93++) {
			System.out.printf("%d ", array93[i93]);
		}
		sc93.close();
	}

	
	//1094 1���� �迭 �⼮�θ���2
	public static void main1094(String[] args) {
		Scanner sc94 = new Scanner(System.in);
		int num94 = sc94.nextInt();
		int [] array94 = new int[num94];
		
		for(int i=0; i<num94; i++) {
			int called = sc94.nextInt();
			array94[i] = called;
		}
		for(int i=0; i<num94; i++) {
			System.out.printf("%d ",array94[num94-i-1]);
		}sc94.close();
	}
	
	
	//1095 �ּڰ�_1
	public static void main1095(String[] args) {
	
		Scanner sc95 = new Scanner(System.in);
		int num95 = sc95.nextInt();
		int [] array95 = new int [num95];
		
		for(int i =0; i<num95; i++) {
			int called = sc95.nextInt();
			array95[i] = called;				
			}
		int min95 = array95[0];
		
		for(int i=1; i<num95;i++) {
			if(array95[i]<min95) {
			min95 = array95[i];
			}
		}
		System.out.println(min95);
		sc95.close();
	}
	
	
	//1095 min���� �˰� �����ϱ�
	public static void main10952(String[] args) {
	Scanner sc952 = new Scanner(System.in);
	int num952 = sc952.nextInt();
	int min952 = 24;
	for(int i =0; i<num952; i++) {
		int called95 = sc952.nextInt();
		if(called95<min952){
			min952 = called95;
		}
	}
	System.out.println(min952);
	sc952.close();
	}
	
	
	//1096 �ٵϵ�
	public static void main1096(String[] args) {
		Scanner sc96 = new Scanner(System.in);
		int num96 = sc96.nextInt();
		int [][]array96 = new int [19][19];

		for (int i =1; i<= num96; i++) {
			array96[sc96.nextInt()-1][sc96.nextInt()-1] =1;
		}
		for(int i=0; i<19 ;i++){
			for(int j=0; j<19; j++) {
				System.out.print(array96[i][j]+" ");
			}
			System.out.println();
			sc96.close();
		}
			
	}
	
	//1097 �ٵϵ� ���� ������
	public static void main1097(String[] args) {
		Scanner sc97 = new Scanner(System.in);
		int [][] array97 = new int [19][19];
	for(int i=0; i<19;i++) {
		for(int j=0; j<19;j++) {
			array97[i][j] = sc97.nextInt();
		}
	} // 19*19�� �Է¹ޱ�
		int num97 = sc97.nextInt();
	for(int i=0; i<num97; i++) {
			int x= sc97.nextInt()-1;
			int y = sc97.nextInt()-1;
			// ���� �ݴ�� ������ �� ��ȿ
	for(int i2=0; i2<19;i2++){
		if(array97[i2][y]==0) {
			array97[i2][y]=1;
		}else array97[i2][y]=0;
	}
	for(int j=0; j<19;j++){
		if(array97[x][j]==0) {
			array97[x][j]=1;
		}else array97[x][j]=0;
	}	
	}

	for(int i=0; i<19; i++) {
		for(int j=0; j<19; j++) {
			System.out.print(array97[i][j]+" ");
		}
		System.out.println();
	}	sc97.close();
	}
	
	
	//1098 �������� �̱�
	public static void main1098(String[] args) {
		Scanner sc98 = new Scanner(System.in);
		int panx = sc98.nextInt();
		int pany = sc98.nextInt();
		int num98 = sc98.nextInt();
		
		int [][] array98 = new int [panx][pany]; //������
		for (int i =0; i<num98; i++) {
			int l98= sc98.nextInt(); //���� ����
			int d98= sc98.nextInt(); //�ڴ� ���� 0:���� 1:����
			int x98= sc98.nextInt()-1; //���� ��ǥx
			int y98= sc98.nextInt()-1; //���� ��ǥy
			if(d98==0) {
				 for(int j=y98; j<y98+l98;j++) {
					 array98[x98][j]=1;
				 }
			}else
				for(int i2=x98; i2<x98+l98; i2++) {
					array98[i2][y98]=1;			 
			}
		} // �Էµ� �� 1�� �����ϱ�
	
		for(int i=0; i<panx; i++) {
			for(int j=0; j<pany; j++) {
				System.out.print(array98[i][j]+" ");
			}
		System.out.println();
		}
		sc98.close();
	}
	
	
	//1099 ������ ����
	public static void main1099(String[] args) {
		Scanner sc99 = new Scanner(System.in);
		int [][] array99 = new int [10][10];
		for(int i=0; i<10;i++) {
			for(int j=0; j<10; j++) {
				array99[i][j]=sc99.nextInt();
			}
		} // 10*10 �̷� ���� ���� �Է�, ���� ��ġ 2�Է�
		
		int r=1;
		
		for(int i=1; i<10;i++) {
			if(array99[i][r]==2) {
				array99[i][r]=9;
				break;				//�Ʒ��� �������� ��
			}
			for(int j=r; j<10; j++) {
				array99[i][j]=9;
				if(array99[i][j+1]==1 ||array99[i][j+1]==2) {
					r = j;
					break;			//������ ���� ��
				}
			}
		}
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++) {
				System.out.print(array99[i][j]+" ");
			}System.out.println();
		}sc99.close();	
	}
}
