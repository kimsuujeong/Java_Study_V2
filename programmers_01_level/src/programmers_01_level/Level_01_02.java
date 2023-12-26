package programmers_01_level;

public class Level_01_02 {
	public static String solution(String number) {
		
		// 핸드폰 번호 가리기
		String answer = "";
		
		for ( int i = 0; i < number.length(); i++) {
			if (i < number.length() - 4)
				answer += "*";
			else
				answer += number.charAt(i);
		}
		
		return answer;
		
	} public static void main(String[] args) { //test case
		
		String number = "010333334444";
		String number2 = "02777888";
		System.out.println(solution(number));
		System.out.println(solution(number2));
		
	}

}
