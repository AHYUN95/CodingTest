package String;

public class contains {

	public static void main(String[] args) {
		String str = "my name is Ahyun";
		System.out.println(str.contains("Ahyun")); //True
		
		int count = 0;
		if(str.contains("my")) count++;
		System.out.println(count); //1
	}

}
