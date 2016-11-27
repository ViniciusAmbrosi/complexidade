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

	public BigInteger recursiveFib(int n) {
		if (n == 0) {
			return BigInteger.ONE;
		}
		if (n == 1) {
			return BigInteger.ZERO;
		}
		return recursiveFib(n - 1).add(recursiveFib(n - 2));

	}
}