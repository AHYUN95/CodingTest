package Level2;

import java.util.HashMap;
import java.util.Map;

public class 문자열압축 {

	public static void main(String[] args) {
		
		solution("aabbaccc");

	}

	static int solution (String s) {
		int answer =0;
		
		for(int i=1; i<=s.length()/2; i++) {//자르는 단뒤
			for(int j=0; j<s.length(); j+=i) {
			String index = s.substring(0,i-1);
			if(index == s.substring(j+i,j+i+i-1))
		}
	}
		
		return answer;
}
	static int count (int n) {
		
		int count = 0;
		
		Map<String, Integer> hm = new HashMap<>();
		
		for(int i=0; i<len; i+=n){
			String index = input.substring(i,i+n);
			if(hm.containsKey(index)) {
				hm.put(index, hm.get(index)+1);
			}else {
				hm.put(index, 1);
			}
		}
		
		for(String key:hm.keySet()) {
			if(Integer.parseInt(key)==1) {
				count+=n;
			}else {
				count+=n+1;
			}
		}
		
		return count;
		
	}
	

}
