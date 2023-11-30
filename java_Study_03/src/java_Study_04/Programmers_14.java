package java_Study_04;

public class Programmers_14 {

	
	public static int solution (int angle) {
		
		
		if (0 < angle && angle < 90) {
			
			return 1;
			
			
		} else if (angle == 90) {
			
			return 2;
			
		} else if ( 90 < angle && angle < 180) {
			
			return 3;
			
		} else {
			
			return 4;
			
		}
		// 아래 코드처럼 한줄로 쓸 수 있음
		// return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;

		
	}
	
	public static void main(String[] args) {
		
		int angle = 90;
		
		System.out.println(solution(angle));
		
	}

}
