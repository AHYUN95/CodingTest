package InputOutput;
import java.util.Scanner;

public class printf {

	public static void main(String[] args) {
		//printf ���Ĺ���
		Scanner printf = new Scanner(System.in);
		int tPrintf = printf.nextInt();
		System.out.printf("%d%n", tPrintf); //10����
		System.out.printf("%o%n", tPrintf); //8����
		System.out.printf("%x%n", tPrintf); //16����
		
		//�ڸ��� ä���ֱ� ex)12�Է�
		System.out.printf("%3d%n", tPrintf); // ����12 ���
		System.out.printf("%03d%n", tPrintf); // 012 ���
		
		//�Ҽ��� �ڸ� �߶��ֱ� %.nf n��° �Ҽ��� ���� �߶��ش�.
		System.out.printf("%.3f", tPrintf); //3��°�ڸ�������
		
		//Ư�� ����
		System.out.println("�ȳ�|t�ϼ���"); // �ȳ�	�ϼ���
		System.out.println("�ȳ�|n�ϼ���");// �ٶ��
		System.out.println("�ȳ�|'�ϼ���|'"); //�ȳ�'�ϼ���'
		System.out.println("�ȳ�||�ϼ���||"); //�ȳ�\�ϼ���\
		
		printf.close();
	}

	
}
