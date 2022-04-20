package Level2;

import java.util.LinkedList;
import java.util.Queue;

public class P16_�ٸ���_������_Ʈ�� {


    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        int answer = 0;
      
        Queue <Integer> q = new LinkedList<>(); //�ٸ��� �ǳʴ� Ʈ��

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
                   // time++; //��¥�� ������ ���� �ϳ� ���ö� �ð��� �߰� �Ǽ� time�� �����ָ� �ߺ��ȴ�.
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
