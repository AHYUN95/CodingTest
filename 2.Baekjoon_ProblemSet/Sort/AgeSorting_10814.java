package Sort;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class AgeSorting_10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		String [][] age = new String [N][2];
		for(int i=0; i<N; i++) {
			String [] str = br.readLine().split(" ");
			age[i][0] = str[0];
			age[i][1] = str[1];
		}
		
		Arrays.sort(age, new Comparator<String[]>() {
			@Override
			public int compare(String[] s1, String []s2) {
				if (s1[0].equals(s2[0]))
					return 0;
				else
					return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
			}
			
		});

		for(int i=0; i<N; i++) {
			sb.append(age[i][0]+" "+age[i][1]+"\n");
		}
		
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
