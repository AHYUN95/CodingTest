package Level2;

import java.util.HashMap;
import java.util.Map;

public class P13_¿ß¿Â {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int solution(String[][] clothes) {
        int answer = 0;
        
        Map <String, Integer> map = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++){
            if(map.containsKey(clothes[i][1])){
                map.put(clothes[i][1], map.get(clothes[i][1])+1);
            }else{
                map.put(clothes[i][1], 1);
            }
        }
        
        int sum = 1;
        for(String key : map.keySet()){
            int num = map.get(key);
            sum *= (num+1);
        }
        answer = sum-1;
        
        return answer;
    }

}
