package Unit13_01_Ex08;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
 * HashMap에 아이디(String)와 점수(Integer)가 저장되어 있음.
 * 실행결과와 같이 평균 점수를 출력하고, 최고 점수와 최고 점수를 받은 아이디를 출력해보세요 
 */
public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;	//최고 점수를 받은 아이디 저장 
		int maxScore = 0;	//최고 점수 저장
		int totalScore = 0;	//점수 합계 저장 
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
		}
		
		double avgScore = (double)totalScore / map.size();
		System.out.println("평균점수: " + avgScore);
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}
}
