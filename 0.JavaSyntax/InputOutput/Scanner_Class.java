package InputOutput;
import java.util.Scanner; // Scanner Ŭ���� ȣ��
public class Scanner_Class {

	public static void main(String[] args) {
		
	Scanner test = new Scanner(System.in); // Scanner��ü ����, System.in : �Է��� �ޱ� ���� �Է� ��Ʈ��
	
	// method > next+type() / string > next(), nextLine()
		
	int c = test.nextInt(); 		// int �� �Է� �� ����
	double f = test.nextDouble(); 	// double �� �Է� �� ����
	String h = test.next(); 		// String �� �Է� �� ���� (������ �������� �� �ܾ ����)
	String i = test.nextLine(); 	// String �� �Է� �� ���� (������ �������� �� ���� ����)
	
	System.out.println(c+f+h+i);
	test.close(); // Scanner �����ϱ�
	
	
	//nextInt() --> nextLine() �Է� �ޱ� ����
	int num = test.nextInt();
	String str = test.nextLine(); // �Է��� �ȵ� ����
	
	System.out.println(num+str);
	
	//nextInet�� ��� ����Ű ������ ���� �Է¸� ���� 
	//�׷��� nextLine�� nextInt�ڿ� ���� ������ �Է��� �޾Ƽ� �޼ҵ� ����ȴ�.
	int num2 = test.nextInt();
	test.nextLine(); // ��� ��(����)���� �޾��ָ鼭 ���๮��(/n)����
	String str2 = test.nextLine();
	
	System.out.println(num2+str2);
	
	//nextInt,next�� ��� 1 2 3 �̷��� �Է� �޾Ƶ� ���� �����̽��� �и���
	Scanner s = new Scanner(System.in);
	int num3 = s.nextInt();
	int num4 = s.nextInt();
	int num5 = s.nextInt();
	System.out.println(num3);
	System.out.println(num4);
	System.out.println(num5);
	s.close();
	}

}
