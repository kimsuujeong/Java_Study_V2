package java_Study_04;

public class Programmers_10 {
	public static int solution(int n, int k) {

		// n = 양꼬치, k는 음료수
		// 양꼬치는 1인분에 12000
		// 음료수는 2000원
		// 10인분 -> 120000원
//
//        int total = 12000*n + 2000*k;
//        
////        int discount = (n*12000 >= 120000 ? (total/120000)*2000 : 0);
//        int discount = total/120000*2000;
////////////////////////////////////////////////////////////////
//        int total = 12000*n + 2000*k;
//        int answer = total - (total/120000*2000);
        
        
        return 12000 * n + 2000*k - (n/10 * 2000);
	}

	public static void main(String[] args) {
		System.out.println(solution(64, 6));
	}
}
