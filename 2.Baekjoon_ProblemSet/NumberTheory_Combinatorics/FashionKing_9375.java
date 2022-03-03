package NumberTheory_Combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FashionKing_9375 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			HashMap<String,Integer> hm = new HashMap<>();
			
			int n = Integer.parseInt(br.readLine());
			
			while(n-->0) {
				String [] s = br.readLine().split(" ");
				String kind = s[1];
				
				//���� ������ �� ���� 1�� �����ֱ�
				if(hm.containsKey(kind)) {
					hm.put(kind, hm.get(kind)+1);
				}
				//������ ���� �־��ְ� 1�� �־��ֱ�
				else {
					hm.put(kind, 1);
				}
				
			}
			int result = 1;
			
			for(int val : hm.values()) {
				result*=(val+1);
			}
			sb.append(result-1+"\n");
			
		}
		
		System.out.println(sb);

	}

}
