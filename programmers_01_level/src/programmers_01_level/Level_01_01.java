package programmers_01_level;

import java.util.Arrays;

public class Level_01_01 {

	public static String solution(String[] seoul) {

		int where_Kim = Arrays.asList(seoul).indexOf("Kim");
		
		return "김서방은 " + where_Kim + "에 있다";
	}
	public static void main(String[] args) { // test case
		
		String[] names = {"Quuu","dfasd","Kim"};
		
		System.out.println(solution(names));
	
		
	}
}
