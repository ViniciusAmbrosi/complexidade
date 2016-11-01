public class FibonnaciTest {

	public static void main(String args[]) {
		FibonnaciUtils fibonnaciCaclulator = new FibonnaciUtils();
		int n = 214748364;
		
		System.out.println("Dynamic Fib");
		TimeService.startChronometer();
		System.out.println(fibonnaciCaclulator.dynamicFib(n));
		TimeService.stopChronometer();
		System.out.println(TimeService.getTime());
		
		System.out.println("--------------------------------------");
		
		System.out.println("Recursviv Fib");
		TimeService.startChronometer();
		System.out.println(fibonnaciCaclulator.normalFib(n));
		TimeService.stopChronometer();
		System.out.println(TimeService.getTime());
	}
}
