package Basic;

import java.util.HashMap;
import java.util.Map;

/*
map = key + value �� ������ �����͸� �����ϴ� �ڷᱸ��
*Ű���� ���� �����ؾ� �Ѵ�. 
*value�� �ߺ��Ǿ �������.
 */
public class Hashmap_ {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		//���Է�
		map.put("A",100);
		map.put("B",101);
		map.put("C",102);
		map.put("C",103); // �ߺ��� �ֽ� Ű ������ ������Ʈ
		//������ �ϱ� ������
		if(!map.containsKey("C")) //ŰC�� ���� ������ ����� �ʰ� ������ �����.
			map.put("c", 104);
	
		System.out.println(map); //{A=100, B=101, C=103}
		System.out.println(map.get("C")); //103
		
		//��� Ű ��� map.keySet()�Լ� ���
		for(String key:map.keySet()) {
			System.out.println(map.get(key));// 100, 101, 103
		}
		
	}

}
