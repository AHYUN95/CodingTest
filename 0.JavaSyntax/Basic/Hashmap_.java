package Basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
map = key + value 두 쌍으로 데이터를 보관하는 자료구죠
*키값은 오직 유일해야 한다. 
*value는 중복되어도 상관없다.
 */
public class Hashmap_ {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		//값입력
		map.put("A",100);
		map.put("B",101);
		map.put("C",102);
		map.put("C",103); // 중복시 최신 키 값으로 없데이트
		//덮어씌우기 하기 싫을때
		if(!map.containsKey("C")) //키C에 값이 있으면 덮어쓰지 않고 없으면 덮어쓴다.
			map.put("c", 104);
		
		//키에 대응하는 값 불러오기
		System.out.println(map); //{A=100, B=101, C=103}
		System.out.println(map.get("C")); //103
		
		//모든 키 출력 map.keySet()함수 사용
		for(String key:map.keySet()) {
			System.out.println(map.get(key));// 100, 101, 103
		}
		
		
		
		//+		
		
		int [] index = {5,3,3,1,4};
		
		Arrays.sort(index); // 1,3,3,4,5
		
		int count = 0;
		Map <Integer, Integer> map2 = new HashMap();
		for(int i=0; i<5; i++) {
			if(!map2.containsKey(index[i]))
			map2.put(index[i],count++);  // 1-0 / 3-1 / 4-2 / 5-3
		}
		
	}

}
