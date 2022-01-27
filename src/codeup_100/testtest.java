package codeup_100;
import java.util.Scanner;

public class testtest {

	public static void main(String[] args) {
	
		Scanner sc46 = new Scanner (System.in);
		String str46 = sc46.nextLine();
		String[] input46 = str46.split(" ");
		int num461 = Integer.parseInt(input46[0]);
		int num462 = Integer.parseInt(input46[1]);
		int num463 = Integer.parseInt(input46[2]);
		sc46.close();

		int sum46 = num461+num462+num463;
		double avg46 = (double)sum46/3;
		
		System.out.printf("%d%n%.1f", sum46, avg46);
	}

}
