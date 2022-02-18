package Basic;
/*
 최대공약수 >> 유클리드 호제법
 GCD(a,b) = GCD(b,r)
 r = a%b
 
 ex) GCD(581,322) = GCD(322,259) = GCD(259,63)
     = GCD(63,7) = GCD(7.0) 
     >> 최대공약수 :7
 
 */
public class GCD {

	public static void main(String[] args) {

		System.out.println(gcd(581,322)); // 출력 7
		
	}
		static int gcd(int a, int b) {
			while(b!=0) {
				int r = a%b;
				a = b;
				b = r;
			}
			return a;
		}
		

	}

