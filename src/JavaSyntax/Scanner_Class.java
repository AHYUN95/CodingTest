package JavaSyntax;
import java.util.Scanner; // Scanner 클래스 호출
public class Scanner_Class {

	public static void main(String[] args) {
	Scanner test = new Scanner(System.in); 
	// Scanner객체 생성, System.in : 입력을 받기 위한 입력 스트림
	// method > next+type() / string > next(), nextLine()
		
	int c = test.nextInt(); 		// int 형 입력 및 리턴
	double f = test.nextDouble(); 	// double 형 입력 및 리턴
	String h = test.next(); 		// String 형 입력 및 리턴 (공백을 기준으로 한 단어를 읽음)
	String i = test.nextLine(); 	// String 형 입력 및 리턴 (개행을 기준으로 한 줄을 읽음)
	}

}
