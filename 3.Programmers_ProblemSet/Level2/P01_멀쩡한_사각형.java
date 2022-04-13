package Level2;

public class P01_멀쩡한_사각형 {

	public static void main(String[] args) {
		//test case
		System.out.println(solution(8,12));
	}
	static long solution(int w, int h) {
	        

	        long GCD = GCD(w,h);
	        
	        long GW = (long)w/GCD;
	        long GH = (long)h/GCD;
	        
	        long totaltri = GCD*tri(GW,GH);
	        return (((long)w*h)-totaltri);

	    }
	    
	    //공약수 구하기
	    static int GCD(int a, int b){
	        while(b!=0){
	            int r = a%b;
	            a=b;
	            b=r;
	        }
	        return a;
	    }
	    //쓰이지 않는 삼각형 구하기
	    
	    static long tri(long w, long h){
	        
	        long min = Math.min(w,h);
	        long max = Math.max(w,h);
	        
	        long temp = max-min;
	        long result = 0;
	        if(temp==1){
	            result = min*2;
	        }else{
	            result = min*2 +(temp-1);
	        }
	        
	        return result;
	    }

}
