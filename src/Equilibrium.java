/**
 * 
 * @author Andres.Cespedes.Morales
 *
 */
public class Equilibrium {

	public Equilibrium() {
		// TODO Auto-generated constructor stub
	}

	public int solution(int X, int[] A) {
		if (null == A) {
			return -1;
		}

		long sumEqualsX = 0;
		long sumDifferentX = 0;
		int indexK = -1;

		for (int i = 0; i < A.length; i++) {
			if (A[i] == X) {
				++sumEqualsX;
			}
		}

		for (int j = A.length - 1; j >= 0; j--) {
			if (A[j] == X) {
				--sumEqualsX;
			} else {
				++sumDifferentX;
			}
			if (sumEqualsX == sumDifferentX) {
				indexK = j;
				break;
			}
		}

		return indexK;

	}

}
