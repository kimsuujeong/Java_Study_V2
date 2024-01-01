package programmers_01_level;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Level_01_09 {
	public static int[] solution(int[] arr) {
		
		/*
		 * ex1) arr = [1,1,3,3,0,1,1] -> [1,3,0,1] 
		 * ex2 )arr = [4,4,4,3,3] -> [4,3]
		 */
		
		
		
		int[] answer = {};
		ArrayList<Integer> arrList = new ArrayList<>();
		
        int num = -1;
        
        for(int i=0; i<arr.length; i++){
             if(arr[i] != num){ 
                 arrList.add(arr[i]); // arr 숫자가 중복되는 것 저장
                 num = arr[i];
             }
        }
        
        answer = new int[arrList.size()]; //answer 리스트 크기 선언.
        for(int i=0; i<answer.length; i++){
            answer[i] = arrList.get(i); 
        } 
		
		

		return answer;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,1,3,3,0,1,1};
        int[] result = solution(arr);

        System.out.println(Arrays.toString(result));

		
	}

}
