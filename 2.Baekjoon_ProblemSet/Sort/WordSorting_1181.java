package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class WordSorting_1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		String [] str = new String [N];
		for(int i=0; i<N; i++) {
			str[i] = br.readLine();
		}
		
		Arrays.sort(str,new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
			if (s1.length()==s2.length())
				return s1.compareTo(s2);  //사전 순서로 배열
			else
				return s1.length()-s2.length();
			}
		});
			sb.append(str[0]+"\n");
		
		for(int i=1; i<N; i++) {
			if(!str[i].equals(str[i-1])) {
			sb.append(str[i]+"\n");
			}
		}
		
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	

	}
}
