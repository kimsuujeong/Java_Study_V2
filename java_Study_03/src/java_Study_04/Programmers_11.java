package java_Study_04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Programmers_11 {
	public static int solution(int[] array) {
		
		 int answer = 0;
	        
	        Arrays.sort(array);
	        
	        int num = array.length / 2;
	        answer = array[num];
	        
	        
	        return answer;
	}
}
