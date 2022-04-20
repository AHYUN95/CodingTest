package Level2;

import java.util.LinkedList;
import java.util.Queue;

public class P16_다리를_지나는_트럭 {


    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        int answer = 0;
      
        Queue <Integer> q = new LinkedList<>(); //다리는 건너는 트럭

        int time =0;
        int limit=0; 
        
        for(int i=0; i<truck_weights.length; i++){
            int idx = truck_weights[i];
            while(true){
                if(q.isEmpty()){
                    q.offer(idx);
                    time ++;
                    limit += idx;
                    break;
                }else if (q.size() == bridge_length){
                    limit -= q.poll();
                   // time++; //어짜피 빠지는 순간 하나 들어올때 시간이 추가 되서 time을 더해주면 중복된다.
                }else{
                    if(limit+idx <= weight){
                        q.offer(idx);
                        limit+= idx;
                        time++;
                        break;
                    }else{
                        q.offer(0);
                        time++;
                    }
                }
            }
        }     
        answer = time + bridge_length;
        
        return answer;
    }
}
