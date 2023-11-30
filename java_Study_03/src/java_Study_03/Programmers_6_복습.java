package java_Study_03;

public class Programmers_6_복습 {
	public static int[] main(int numer1, int denom1, int numer2, int denom2) {
		
		
		
		int finalnumer = (numer1 * denom2) + (numer2 * denom1);
		int finaldenom = denom1 * denom2;
		// 최소 공약수를 구하는 방법
		for (int i = finalnumer - 1 ; i > 1; i--) {
			if ( finalnumer % i == 0 && finaldenom % i == 0) {
				finalnumer /= i;
				finaldenom /= i;
			}
		}
		
		int[] answer = {finalnumer, finaldenom};
		
		return answer;
		
	}

}