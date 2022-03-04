package NumberTheory_Combinatorics;

import java.util.Scanner;

public class CountZero_2004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		int five = five(n)-(five(m)+five(n-m));
		int two = two(n)-(two(m)+two(n-m));
		System.out.println(Math.min(five, two));

	}
		//n!ÀÇ 5½ÂÀÇÀÇ °¹¼ö
		static int five(int n) {
			int count = 0;
			while(n>=5) {
				count += n/5;
				n/=5;
			}
			return count;
		}
		
		//n!ÀÇ 2½ÂÀÇ °¹¼ö
		static int two(int n) {
			int count = 0;
			while(n>=2) {
				count += n/2;
				n/=2;
			}
			return count;
		}
}
