package String;
/*
  .equals("")
  ���ڿ� �� �ϴ� �Լ�
 	==�� ������
	equals : ����� ���� ��ü�� ��
	== : ����� �ּҰ��� ��
	
	+�⺻ �ڷ��������� ==�� ���� ����� ���� ���ϴ� ������
	+������������ ==�� �ּ� ��
 */

public class equals {

	public static void main(String[] args) {
		String a = "aaa";
		String b = a;		//a�� b�� �ּҰ��� ����
		String c = new String ("aaa"); //�� �ּҰ��� c�� �Ҵ�
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
		 * �ٸ� Ŭ������ �Լ��� ����Ͽ� string���� ������ �ּҰ��� �ٸ���.
		 * str2[2] = "c" ������ �� Ŭ������ heap�� ���� �Ǿ��� �ִ� c���� �ּҰ��� �ٸ�
		 * ���� string�� ���ͷ��� ������ ���� �ּҰ��� ����Ų��.
		 */
		System.out.println(str2[2]=="c"); //false
		System.out.println(str2[2].equals("c")); //true
	}

}
