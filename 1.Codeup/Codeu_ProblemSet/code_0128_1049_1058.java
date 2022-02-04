package Codeu_ProblemSet;
import java.util.Scanner;
public class code_0128_1049_1058 {

	public static void main(String[] args) {
		// 1049 정수 비교, 대소 비교
		Scanner sc49 = new Scanner(System.in);
		String input49 = sc49.nextLine();
		String [] comparion = input49.split(" ");
		int num49f = Integer.parseInt(comparion[0]);
		int num49s = Integer.parseInt(comparion[1]);
		sc49.close();
		
		if (num49f > num49s) {
			System.out.print("1");
		} else
			System.out.print("0");
	}
	
	public static void main50(String[] args) {
		//1050, 같은지 비교
		Scanner sc50 = new Scanner(System.in);
		String input50 = sc50.nextLine();
		String [] comparion = input50.split(" ");
		int num50f = Integer.parseInt(comparion[0]);
		int num50s = Integer.parseInt(comparion[1]);
		sc50.close();
		
		if (num50f == num50s) {
			System.out.print("1");
		} else
			System.out.print("0");
	}


		//1051 b가 a보다 크거나 같으면 1, 그렇지 않으면 0
		//1052 
	public static void main53(String[] args) {
		Scanner sc53 = new Scanner(System.in);
		int tf = sc53.nextInt();
		sc53.close();
		
		if(tf == 1) {
			System.out.print("0");
		}else 
			System.out.print("1");
		}
	
	//1054 참일때만 참 출력 
	//논리 연산자 && AND
	public static void main54(String[] args) {
		Scanner sc54 = new Scanner(System.in);
		String input54 = sc54.nextLine();
		String[] TF54 = input54.split(" ");
		int TF54F = Integer.parseInt(TF54[0]);
		int TF54S = Integer.parseInt(TF54[1]);
		sc54.close();
		
		if(TF54F ==1 && TF54S == 1) {
			System.out.print("1");
		}else
			System.out.print("0");
	}
	
	//1055 논리 연산자 || OR
	public static void main55(String[] args) {
		Scanner sc55 = new Scanner(System.in);
		String input55 = sc55.nextLine();
		String[] TF55 = input55.split(" ");
		int TF55F = Integer.parseInt(TF55[0]);
		int TF55S = Integer.parseInt(TF55[1]);
		sc55.close();
		
		if(TF55F ==1 || TF55S == 1) {
			System.out.print("1");
		}else
			System.out.print("0");
	}
	
	//1056 논리 연산자 XOR 서로 다를떄만 참을 출력
	public static void main56(String[] args) {
		Scanner sc56 = new Scanner(System.in);
		String input56 = sc56.nextLine();
		String[] TF56 = input56.split(" ");
		int TF56F = Integer.parseInt(TF56[0]);
		int TF56S = Integer.parseInt(TF56[1]);
		sc56.close();
		
		if(TF56F != TF56S) {
			System.out.print("1");
		}else
			System.out.print("0");
	}
	//1057
	public static void main57(String[] args) {
		Scanner sc57 = new Scanner(System.in);
		String input57 = sc57.nextLine();
		String[] TF57 = input57.split(" ");
		int TF57F = Integer.parseInt(TF57[0]);
		int TF57S = Integer.parseInt(TF57[1]);
		sc57.close();
		
		if(TF57F == TF57S) {
			System.out.print("1");
		}else
			System.out.print("0");
	}
	//1058
	public static void main58(String[] args) {
		Scanner sc58 = new Scanner(System.in);
		String input58 = sc58.nextLine();
		String[] TF58 = input58.split(" ");
		int TF58F = Integer.parseInt(TF58[0]);
		int TF58S = Integer.parseInt(TF58[1]);
		sc58.close();
		
		if(TF58F == 0 && TF58S == 0) {
			System.out.print("1");
		}else
			System.out.print("0");
	}
	}


	

	

