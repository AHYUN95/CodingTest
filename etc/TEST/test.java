package TEST;

import java.util.ArrayList;
import java.util.HashMap;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Solution {

	    public int solution(int[] matches, int me, int opp) {

	        int answer = 0;

	        //�������� count�� 1�� ���� ���ܴ� -1�� count�� 0��
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for(int i=0; i<matches.length; i++){
	            if(map.containsKey(matches[i])){
	                map.put(matches[i],map.get(matches[i])+1);
	            }else{
	                map.put(matches[i],1);
	            }
	        }
	        //mearr = ���� ��±��� �� ��Ʈ opparr ������ ��±��� ����Ʈ
	        ArrayList <Integer> mearr = new ArrayList<>();

	        int idx1 = matches[me];
	        while(idx1!=-1){
	            mearr.add(idx1);
	            idx1 = matches[idx1];

	        }

	          ArrayList <Integer> opparr = new ArrayList<>();

	        int idx2 = matches[opp];
	        while(idx2!=-1){
	            opparr.add(idx2);
	            idx2 = matches[idx2];
	        }

	        //������ ���� ����� �ε���
	       answer = opparr.size();
	        int meet = -1;

	        for(int i=0; i<mearr.size(); i++){
	            for(int k=0; k<opparr.size(); k++){
	                  if(mearr.get(i)==opparr.get(i)){
	                      meet = mearr.get(i);
	                      break;
	                  }
	                }
	        }

	        int count = 0;

	        for(int i=0; i<mearr.size(); i++){
	            if(map.get(mearr.get(i))!=1){
	                count++;
	            }
	            if(mearr.get(i) == meet){
	                break;
	            }
	        }

	        answer = count;
	        return answer;
	    }
	}

}
