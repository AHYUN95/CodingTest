package Sort;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Compress_18870  {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		String [] str = br.readLine().split(" ");
		int [] arr = new int [N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		int [] index = arr.clone();
		
		Arrays.sort(index);
		
		int count = 0;
		Map <Integer, Integer> map = new HashMap();
		for(int i=0; i<N; i++) {
			if(!map.containsKey(index[i]))
			map.put(index[i],count++);
		}
		
		for(int i=0; i<N; i++) {
			sb.append(map.get(arr[i])+" ");
		}
		
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		br.close();
	}

}
