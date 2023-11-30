package java_Study_03;

public class Programmers_8 {
	public static int main(int slice,int n) {
//		// answer -> 피자 수
//		int answer = 0;
//		
//		int pizza = 7;
//		
//		// 사람 수 보다 피자 수가 더 많아야함
//		if (n%7 != 0) {
//			answer = n/pizza+1;
//		} else {
//			answer = n/pizza;
//		}
		
////////////////////////////////////////////////
		
//	    int answer = 0;
//	    int pizza = slice;
	//    
//	    if (n%slice != 0){
//	        answer = n/pizza+1;
//	    } else {
//	        answer = n/pizza;
//	    }
		
		return (n + (slice-1))/slice;
	}
}
