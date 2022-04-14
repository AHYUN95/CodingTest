	package Level2;

import java.util.HashMap;
import java.util.Map;

public class P12_전화번호_목록 {

	public static void main(String[] args) {
		// TEST CASE

	}
	
    public boolean solution(String[] phone_book) {
       
        
        Map <String, Integer> hm = new HashMap<>();
        
        for(int i=0; i<phone_book.length; i++){
            hm.put(phone_book[i], i);
        }
        
        for(int i=0; i<phone_book.length; i++){
            for(int j=1; j<phone_book[i].length(); j++){
                if(hm.containsKey(phone_book[i].substring(0,j))){
                    return false;
                }
            }
        }
        return true;
        
    }

}
