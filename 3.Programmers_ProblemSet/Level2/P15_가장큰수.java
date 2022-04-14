package Level2;

import java.util.Arrays;
import java.util.Comparator;

public class P15_가장큰수 {

	public static void main(String[] args) {
		

	}

    public String solution(int[] numbers) {
        String answer = "";
        String num [] = new String [numbers.length];
        for(int i=0; i<numbers.length; i++){
            num[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(num,new Comparator<String>(){
           @Override
            public int compare (String s1, String s2){
                return (s1+s2).compareTo(s2+s1);
            }
        });
        
        for(int i=num.length-1; i>=0; i--){
            answer += num[i];
        }
         
        if(answer.charAt(0) == '0'){ //예외처리
            return "0";
        }
        
        return answer;
    }
}
