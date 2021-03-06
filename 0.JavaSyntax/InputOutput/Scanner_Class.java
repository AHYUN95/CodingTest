package InputOutput;
import java.util.Scanner; // Scanner 클래스 호출
public class Scanner_Class {

	public static void main(String[] args) {
		
	Scanner test = new Scanner(System.in); // Scanner객체 생성, System.in : 입력을 받기 위한 입력 스트림
	
	// method > next+type() / string > next(), nextLine()
		
	int c = test.nextInt(); 		// int 형 입력 및 리턴
	double f = test.nextDouble(); 	// double 형 입력 및 리턴
	String h = test.next(); 		// String 형 입력 및 리턴 (공백을 기준으로 한 단어를 읽음)
	String i = test.nextLine(); 	// String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음)
	
	System.out.println(c+f+h+i);
	test.close(); // Scanner 종료하기
	
	
	//nextInt() --> nextLine() 입력 받기 오류
	int num = test.nextInt();
	String str = test.nextLine(); // 입력이 안됨 오류
	
	System.out.println(num+str);
	
	//nextInet의 경우 엔터키 누르기 전의 입력만 받음 
	//그래서 nextLine이 nextInt뒤에 남은 엔터의 입력을 받아서 메소드 종료된다.
	int num2 = test.nextInt();
	test.nextLine(); // 대신 값(엔터)값을 받아주면서 개행문자(/n)삭제
	String str2 = test.nextLine();
	
	System.out.println(num2+str2);
	
	//nextInt,next의 경우 1 2 3 이렇게 입력 받아도 엔터 스페이스로 분리됨
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
