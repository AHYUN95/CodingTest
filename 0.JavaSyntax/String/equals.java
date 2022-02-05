package String;
/*
  .equals("")
  문자열 비교 하는 함수
 	==과 차이점
	equals : 대상의 내용 자체를 비교
	== : 대상의 주소값을 비교
	
	+기본 자료형에서는 ==는 실제 저장된 값을 비교하는 연산자
	+참조형에서는 ==는 주소 비교
 */

public class equals {

	public static void main(String[] args) {
		String a = "aaa";
		String b = a;		//a랑 b는 주소값이 같음
		String c = new String ("aaa"); //새 주소값에 c를 할당
		String d = "aaa";
		
		System.out.println( a.equals(b)); //True
		System.out.println( a==b);	//True
		System.out.println( a==c);  // False
		System.out.println( a.equals(c)); //True
		System.out.println(d==a);	//True

		
		String [] str = {"a","b","c","d","f"} ;
		String s = str[2];
		System.out.println(s=="c");	//true
		System.out.println(str[2]=="c"); //true
		System.out.println(s.equals("c")); //true
		
		String s2 = "q";
		System.out.println(s2=="q"); //true
		System.out.println(s2.equals("q")); //true
		
		String s3 = "a b c d f";
		String [] str2 = s3.split(" "); 
		/*
		 * 다른 클래스의 함수를 사용하여 string값을 받으면 주소값이 다르다.
		 * str2[2] = "c" 이지만 이 클래스의 heap에 저장 되어져 있는 c와의 주소값은 다름
		 * 원래 string은 리터럴이 같으면 같은 주소값을 가르킨다.
		 */
		System.out.println(str2[2]=="c"); //false
		System.out.println(str2[2].equals("c")); //true
	}

}
