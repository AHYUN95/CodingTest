package BruteForce;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BlackJack {

	public static void main(String[] args)throws IOException {
		//브루트포스: 해가 존재할 것 같은 모든 값을 탐색
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		br.close();
		
		String[] str1 = s1.split(" ");
		int n = Integer.parseInt(str1[0]);	//카드 갯수
		int m = Integer.parseInt(str1[1]);	//합 최대
		
		
		String[] str2 = s2.split(" ");
		int [] num = new int [n];
		for(int i=0; i<n ;i++) {
			num[i] = Integer.parseInt(str2[i]);
		}
		//모든 해 구하기
		int sum = 0;
		int tmp = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					sum = num[i]+num[j]+num[k];
					if(tmp < sum && sum <= m)
						tmp = sum;
				}
			}
		}
		System.out.println(tmp);
	}

}
