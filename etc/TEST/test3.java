package TEST;

public class test3 {

	public static void main(String[] args) {
		int width = 15;
		int height = 47;
		int diagonals  [][] = {{17,19}};
		solution(width,height,diagonals);
		
	}
	
    static int solution(int width, int height, int[][] diagonals) {
    	
        int answer = 0;
        int div = 10000019;
       
        int a = 1;
      
        for(int i=1; i<=width+height; i++) {
        	a= (a*i)%div;
        
        }
        int b =1;
        for(int i=1; i<=width;i++) {
        	b =(b*i)%div;
        }
        
        int c =1;
        for(int i=1; i<=height ;i++) {
        	c =(c*i)%div;
        	System.out.println(c);
        }
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println((b*c)%div);
        System.out.println(diagonals.length);
        
        
        answer = (a%div/(b*c%div))*diagonals.length;
        
        System.out.println(answer);
        return answer;
        
    }
}
