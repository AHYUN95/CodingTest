package Level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class P3_����ä�� {

	public static void main(String[] args) {
		//test ���̽� 
		String [] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		System.out.println(solution(record));

	}
	static String[] solution(String[] record) {
        

        Map<String, String> hm = new HashMap<String,String>();
        
        for(int i=0; i<record.length; i++) {
        	String tmp [] = record[i].split(" "); //����/�����id/�г���
        	if(! tmp[0].equals("Leave")) {
        		hm.put(tmp[1], tmp[2]);
        	}
        }
        
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i=0; i<record.length; i++) {
        	String tmp [] = record[i].split(" ");
        	if(tmp[0].equals("Enter")){
        		list.add(hm.get(tmp[1])+"���� ���Խ��ϴ�.");
        	}else if(tmp[0].equals("Leave")){
        		list.add(hm.get(tmp[1])+"���� �������ϴ�.");
        	}
        }
        
        String[] answer = new String [list.size()];
        for(int i=0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
