package java_Study_04;

import java.util.ArrayList;

public class Programmers_12_복습 {
	public ArrayList<Integer> solution(int n) {
		
		ArrayList<Integer> answer = new ArrayList<Integer>();

		
		for (int i = 1; i<=n; i+=2) {
				answer.add(i);
			}
		
		return answer;
	
	
	}
}
