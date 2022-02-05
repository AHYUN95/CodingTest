package Char;


import java.util.Scanner;

/*
 toCharArray() : 문자열 데이터를 char배열에 한글자씩 삽입
 */
public class to_Char_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] arr = sc.nextLine().toCharArray();
		System.out.println(arr[2]);  // 12345>3출력, AHYUN>Y출력
		sc.close();
		
	}

}
