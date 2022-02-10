package Basic;

import java.util.Arrays;
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
		
		//Ű�� �����ϴ� �� �ҷ�����
		System.out.println(map); //{A=100, B=101, C=103}
		System.out.println(map.get("C")); //103
		
		//��� Ű ��� map.keySet()�Լ� ���
		for(String key:map.keySet()) {
			System.out.println(map.get(key));// 100, 101, 103
		}
		
		
		
		//+		
		
		int [] index = {5,3,3,1,4};
		
		Arrays.sort(index); // 1,3,3,4,5
		
		int count = 0;
		Map <Integer, Integer> map2 = new HashMap();
		for(int i=0; i<5; i++) {
			if(!map2.containsKey(index[i]))
			map2.put(index[i],count++);  // 1-0 / 3-1 / 4-2 / 5-3
		}
		
	}

}
