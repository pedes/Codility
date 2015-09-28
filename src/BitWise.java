/**
 * 
 * @author Andres.Cespedes.Morales
 *
 */
public class BitWise {

	public BitWise() {
		// TODO Auto-generated constructor stub
	}

	public int solution(int M, int N) {
		int sum = 0;
		if ((M - N) == 1) {
			return bitAddition(M, N);
		} else {
			int temp = M + 1;
			sum = M;
			while (temp <= N) {
				sum = bitAddition(sum, temp);
				temp = temp + 1;
			}
		}
		return sum;
	}

	public int bitAddition(int a, int b) {
		String binaryM = Integer.toBinaryString(a);
		String binaryN = Integer.toBinaryString(b);
		char[] arrayM = binaryM.toCharArray();
		char[] arrayN = binaryN.toCharArray();
		char[] result = new char[binaryM.length()];
		
		int cycleSize = arrayM.length > arrayN.length ? arrayN.length
				: arrayM.length;
		String mayor = arrayM.length > arrayN.length ? "a"
				: "b";
		
		if("a".equalsIgnoreCase(mayor)){
			for (int i = cycleSize - 1; i >= 0; i--) {
				if ((arrayM[i] == '1') && (arrayN[i+1] == '1')) {
					result[i] = '1';
				} else {
					result[i] = '0';
				}
			}
		}else{
			for (int i = cycleSize - 1; i >= 0; i--) {
				if ((arrayM[i] == '1') && (arrayN[i] == '1')) {
					result[i] = '1';
				} else {
					result[i] = '0';
				}
			}
		}


		return Integer.parseInt(String.copyValueOf(result), 2);
	}

	public static void main(String[] args) {
		System.out.println(new BitWise().solution(5, 7));
	}

}
