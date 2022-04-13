package Level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class P06_기능개발 {

	public static void main(String[] args) {
		
		int [] progresses = {1,2,3,6,7,3,98,65};
		int [] speeds = {5,10,3,54,2,4,6,10};
		
		solution(progresses,speeds);

		
	}

	    static int[] solution(int[] progresses, int[] speeds) {
	    	
	    	Queue<Integer> queue = new LinkedList<Integer>();
	        for(int i=0; i<progresses.length; i++){
	            queue.offer((int)Math.ceil((100-progresses[i])/speeds[i]));
	        }
	        
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        while(!queue.isEmpty()){
	            int cnt = 1;
	            int index = queue.poll();
	            while(!queue.isEmpty() && queue.peek() <= index ){
	                cnt++;
	                queue.remove();
	            }
	            list.add(cnt);
	        }
	        
	        int [] answer = new int [list.size()];
	        for(int i=0; i<answer.length; i++){
	            answer[i] = list.get(i);
	            //test출력
	            System.out.println(answer[i]);
	        }
	        return answer;
	    }
	}
