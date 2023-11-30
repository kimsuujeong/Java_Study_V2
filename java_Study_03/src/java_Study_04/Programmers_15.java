package java_Study_04;

public class Programmers_15 {
	public static String solution(String Str) {

		String answer = "";
		char[] arry = Str.toCharArray();

		for (int i = 0; i < arry.length; i++) {

			String temp = arry[i] + "";

			answer = arry[i] >= 97 && arry[i] <= 122 ? (answer += temp) : (answer += temp);

		}
		return answer;
	}

	public static void main(String[] args) {

		String abcd = "aBcDeFg";

		System.out.println(solution(abcd));
	}
}
