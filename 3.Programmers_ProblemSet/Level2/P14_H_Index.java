package Level2;

import java.util.Arrays;

public class P14_H_Index {

	public static void main(String[] args) {
		int [] citations = {1,5,9,6,7,8,3,5,3,3,2};
		System.out.println(solution(citations));

	}
	
   static int solution(int[] citations) {
        int answer = 0;
        
        int n = citations.length; //논문 수
        
        Arrays.sort(citations); //오름 차순으로 정렬
        
        int cnt = 0;
        
        for(int i=n-1; i>=0; i--){
            cnt ++;
            if(cnt>=citations[i]){
                answer = citations[i]; 
                break;
            }
        }
        
        
        return answer;
    }

}
