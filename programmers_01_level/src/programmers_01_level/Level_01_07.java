package programmers_01_level;

import java.util.HashMap;
import java.util.Scanner;

class Level_01_07 {
	
//	마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
//	completion의 길이는 participant의 길이보다 1 작습니다.
//	참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
//	참가자 중에는 동명이인이 있을 수 있습니다.
	
	/*ex)
	 * participant ["leo","kiki","eden"]
	 * completion ["eden","kiki"]
	 * return ["leo']*/

	//HashMap 알고리즘
	
	public static String[] participant = {"leo","kiki","eden"};
	public static String[] completion = {"edem","kiki"};
	
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hm = new HashMap<>();
        for(String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        // 선수 명단 출력
        for(String player : completion) hm.put(player, hm.getOrDefault(player, 0) -1);
        // 들어온 선수 명단
        for(String key : hm.keySet()) {
        	if(hm.get(key) != 0) {
        		answer = key;
        		System.out.println(answer);
        		break;
        	}
        }
        
        
        return answer;
    }
    
    public static void main(String[] args) {
    	
    	System.out.println(solution(participant, completion));
    	
	}

}