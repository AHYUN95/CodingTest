package BruteForc3;
import java.util.Scanner;
public class director {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int num =665;
		int count = 0;
		
		while(true) {
			num++;
			String str = String.valueOf(num);
			if(str.contains("666")) count++;
			
			if(count == n) {
				break;
			}
			
		}
		System.out.println(num);
		sc.close();
	}

}
