import java.math.BigInteger;

public class FibonnaciUtils {
	
	public static final BigInteger ZERO = BigInteger.ZERO;
	public static final BigInteger ONE = BigInteger.ONE;
	
	public BigInteger dynamicFib(int n) {
		BigInteger storedCalculations[] = new BigInteger[n + 1];
		
		storedCalculations[0] = ZERO;
		storedCalculations[1] = ONE;

 		for (int i = 2; i <= n; i++) {
 			storedCalculations[i] = storedCalculations[i - 1].add(storedCalculations[i - 2]);
		}
		return storedCalculations[n];
	}

	public BigInteger normalFib(int n) {
		if (n <= 1) {
			return new BigInteger(String.valueOf(n));
		}
		BigInteger fibo = ONE;
		BigInteger fiboPrev = ONE;
		for (int i = 2; i < n; ++i) {
			BigInteger temp = fibo;
			fibo = fibo.add(fiboPrev);
			fiboPrev = temp;
		}
		return fibo;
	}
}
