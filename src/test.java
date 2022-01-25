import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc20 = new Scanner(System.in);
		String per = sc20.nextLine();
		String[] num = per.split("-");
		System.out.printf("%s%s", num[0],num[1]);
		
	}

}

