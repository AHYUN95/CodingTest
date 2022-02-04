package Basic;
import java.util.ArrayList;

/*
 	Array : 인덱스를 가진 데이터 집합
 			랜덤 엑세스 가능 중간에 삽입,삭제 어려움
 	List : 인덱스 없이 순차적으로 저장된 데이터 집합
 			랜덤엑세스 불가능, 데이터 삽입 삭제 쉬움
 	List자료형 : ArrayList, Vector, LinkedList
 */
public class List {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("첫번째");
		list.add("두번째");
		list.add("세번째");
		list.add(2,"두번째뒤");	//list.add(이 숫자 뒤에 끼어듬, "끼어들것")
		
		System.out.println(list);
		//출력[첫번째, 두번째, 두번째 뒤 세번째]
		
		//GET함수  출력[두번째]
		System.out.println(list.get(1));
		
		//Size함수 출력[4]
		System.out.println(list.size());
		
		//Contains함수 출력 : True
		//List에 해당 값이 있으면 True 없으면 False
		System.out.println(list.contains("세번째"));
		
		//Remove함수 값을 넣는다.
		//삭제가 성공하면 true, 실패하면 false 리턴
		 list.remove("두번째뒤");
		 System.out.println(list);
		 
		 list.add(2,"두번째뒤");
		 System.out.println(list);
		 
		 //출력 : True
		 boolean result = list.remove("두번째뒤");
		 System.out.println(result);
		 
		 //Remove함수 인덱스값을 넣는다.
		 //삭제 성공하면 삭제값을 리턴
		 list.remove(2);
		 System.out.println(list);
		 
		 //출력 : 첫번째
		 String result2 = list.remove(0);
		 System.out.println(result2);
		 
	}

}
