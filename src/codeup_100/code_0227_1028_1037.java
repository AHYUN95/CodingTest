package codeup_100;
import java.util.Scanner;

public class code_0227_1028_1037 {
	public static void main(String[] args) {
		
		//1028 ���� �Է� �޾� ���
		Scanner sc28 = new Scanner(System.in);
		int ip28 = sc28.nextInt();
		System.out.printf("%d", ip28);
		sc28.close();
		
		//1029 �Ǽ� �Է� �޾� ���
		Scanner sc29 = new Scanner(System.in);
		float ip29 = sc28.nextFloat();
		System.out.printf("%f", ip29);
		sc29.close();
		
		//1031 ��º�ȯ 10������ �޾Ƽ� 8������ ���
		Scanner sc31 = new Scanner(System.in);
		int ip31 = sc31.nextInt();
		System.out.printf("%o",ip31);
		sc31.close();
		
		//1032, 1033 10���� �̷� 16���� ���
		Scanner sc32 = new Scanner(System.in);
		int ip32 = sc32.nextInt();
		System.out.printf("%x",ip32); //�ҹ��� %x
		System.out.printf("%X",ip32); //�빮�� %X
		sc32.close();
		
		//1034 8������ �Է� �޾Ƽ� 10������ �ٲپ� ���
		Scanner sc34 = new Scanner(System.in);
		String str34 =sc34.nextLine();
		int int34 = Integer.parseInt(str34, 8);
		System.out.println(int34);
		sc34.close();
		
		//1035 16���� �Է� �޾Ƽ� 8������ ����ϱ�
		Scanner sc35 = new Scanner(System.in);
		String str35 = sc35.nextLine();
		int num35 = Integer.parseInt(str35,16);
		String eit35 = Integer.toOctalString(num35);
		System.out.println(eit35);
		sc35.close();
		
		//1036 ������ 1�� �Է� �޾Ƽ� 10������ ����ϱ�
		Scanner sc36 = new Scanner(System.in);
		char c = sc36.next().charAt(0);
		System.out.println((int)c);
		sc36.close();
		
		//1037 ���� �Է� �޾� �ƽ�Ű�ڵ� ��ȯ
		Scanner sc37 = new Scanner(System.in);
		int num37 = sc37.nextInt();
		System.out.println((char)num37);
		sc37.close();
		
	}
	
	

}
