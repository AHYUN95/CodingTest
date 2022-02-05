package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class SortInside_1427 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String [] str = s.split("");
		Arrays.sort(str,Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length; i++) {
			sb.append(str[i]);
		}
		System.out.println(sb);
	}

}
