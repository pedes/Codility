import java.util.Map;
import java.util.TreeMap;
/**
 * 
 * @author Andres.Cespedes.Morales
 *
 */
public class Distance {

	public Distance() {
	}

	public int solution(int[] A) {
		if (null == A || A.length == 1) {
			return -1;
		}
		
		int maximumDistance = -1;
		
		Map<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>();

		for (int i = 0; i < A.length; i++) {
			sortedMap.put(A[i], i);
		}
		
		int lastIndex = 0;
		int lastKey = 0;
		int tempDistance = 0;
		for (Map.Entry<Integer,Integer> entry : sortedMap.entrySet()) {
			if(lastKey == entry.getKey()){
				continue;
			}
			tempDistance = distance(lastKey, entry.getKey());
			if(tempDistance > 1 & (maximumDistance < distance(lastIndex, entry.getValue())) ){
					maximumDistance = distance(lastIndex, entry.getValue()) ;
			}
			lastIndex = entry.getValue();
			lastKey = entry.getKey();
	   }

		return maximumDistance;
	}

	public static int distance(int P, int Q) {
		return Math.abs(P - Q);
	}

}
