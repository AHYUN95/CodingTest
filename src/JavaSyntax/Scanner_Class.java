package JavaSyntax;
import java.util.Scanner; // Scanner Ŭ���� ȣ��
public class Scanner_Class {

	public static void main(String[] args) {
		
	Scanner test = new Scanner(System.in); // Scanner��ü ����, System.in : �Է��� �ޱ� ���� �Է� ��Ʈ��
	
	// method > next+type() / string > next(), nextLine()
		
	int c = test.nextInt(); 		// int �� �Է� �� ����
	double f = test.nextDouble(); 	// double �� �Է� �� ����
	String h = test.next(); 		// String �� �Է� �� ���� (������ �������� �� �ܾ ����)
	String i = test.nextLine(); 	// String �� �Է� �� ���� (������ �������� �� ���� ����)
	
	test.close(); // Scanner �����ϱ�
	
	
	//nextInt() --> nextLine() �Է� �ޱ� ����
	int num = test.nextInt();
	String str = test.nextLine(); // �Է��� �ȵ� ����
	
	//nextInet�� ��� ����Ű ������ ���� �Է¸� ���� 
	//�׷��� nextLine�� nextInt������ �Է��� �޾Ƽ� �޼ҵ� ����ȴ�.
	int num2 = test.nextInt();
	test.nextLine(); // ���๮��(/n)����
	String str2 = test.nextLine();
	
	
	//nextInt,next�� ��� 1 2 3 �̷��� �Է� �޾Ƶ� ���� �����̽��� �и���
	Scanner s = new Scanner(System.in);
	int num3 = s.nextInt();
	int num4 = s.nextInt();
	int num5 = s.nextInt();
	System.out.println(num3);
	System.out.println(num4);
	System.out.println(num5);
	
	}

}
