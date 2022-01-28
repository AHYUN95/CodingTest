package codeup_100;

import java.util.Scanner;

public class testtest {

	public static void main(String[] args) {
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

