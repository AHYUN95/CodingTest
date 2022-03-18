package Basic;
import java.util.ArrayList;

/*
 	Array 
 	>> ���̸� �˼� ���� �迭���� ����ϸ� ���� (���α׷��ӽ� lv.2 ����ä�� ����)
 	
 	: �ε����� ���� ������ ����
 			���� ������ ���� �߰��� ����,���� �����
 	List : �ε��� ���� ���������� ����� ������ ����
 			���������� �Ұ���, ������ ���� ���� ����
 	List�ڷ��� : ArrayList, Vector, LinkedList
 */
public class List {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("ù��°");
		list.add("�ι�°");
		list.add("����°");
		list.add(2,"�ι�°��");	//list.add(�� ���� �ڿ� �����, "������")
		
		System.out.println(list);
		//���[ù��°, �ι�°, �ι�° �� ����°]
		
		//GET�Լ�  ���[�ι�°]
		System.out.println(list.get(1));
		
		//Size�Լ� ���[4]
		System.out.println(list.size());
		
		//Contains�Լ� ��� : True
		//List�� �ش� ���� ������ True ������ False
		System.out.println(list.contains("����°"));
		
		//Remove�Լ� ���� �ִ´�.
		//������ �����ϸ� true, �����ϸ� false ����
		 list.remove("�ι�°��");
		 System.out.println(list);
		 
		 list.add(2,"�ι�°��");
		 System.out.println(list);
		 
		 //��� : True
		 boolean result = list.remove("�ι�°��");
		 System.out.println(result);
		 
		 //Remove�Լ� �ε������� �ִ´�.
		 //���� �����ϸ� ������ ����
		 list.remove(2);
		 System.out.println(list);
		 
		 //��� : ù��°
		 String result2 = list.remove(0);
		 System.out.println(result2);
		 
		 
		 /*


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
		  
		  
		  
		  */
		 
	}

}
