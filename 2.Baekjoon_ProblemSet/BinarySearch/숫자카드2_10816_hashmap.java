package BinarySearch;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 숫자카드2_10816_hashmap {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		Map <Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			if(hm.containsKey(num)) {
				hm.put(num, hm.get(num)+1);
			}else {
				hm.put(num, 1);
			}
		}
		int m = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<m ; i++) {
			int idx = sc.nextInt();
			if(hm.containsKey(idx)) {
				sb.append(hm.get(idx)+" ");
			}else {
				sb.append(0);
			}
		}
	}

	
}
