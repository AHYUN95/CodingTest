package GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bracket_1541{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String [] minus = s.split("\\-");

			int sum = 0;
			//-나오기 이전 값 minus[0] 총합
			String [] first = minus[0].split("\\+");
			for(int i=0; i<first.length; i++) {
				sum += Integer.parseInt(first[i]);
			}
		
			// - 나온 이후 값들(minus[1]부터)은 다 -로 변경해서 더 해주면 된다
			for(int i=1; i<minus.length; i++) {
				String [] plus = minus[i].split("\\+");
				for(int j=0; j<plus.length; j++) {
					sum += -Integer.parseInt(plus[j]);
				}
			}
			System.out.println(sum);	

	}
	}
