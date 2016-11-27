import java.util.ArrayList;
import java.util.List;

public class FibonnaciAnalysis {

	public static void main(String[] args) {

		FibonnaciUtils fibonnaciCalculator = new FibonnaciUtils();

		List<String> analysis = new ArrayList<>();

		analysis.add("\tDynamic Fib\tRecursviv Fib");

		for (int n = 1; n <= 40; n++) {
			StringBuilder row = new StringBuilder();

			row.append("n= ").append(n).append("\t");

			TimeService.startChronometer();
			fibonnaciCalculator.dynamicFib(n);
			TimeService.stopChronometer();
			row.append(TimeService.getTime());

			row.append("\t");

			TimeService.startChronometer();
			fibonnaciCalculator.recursiveFib(n);
			TimeService.stopChronometer();
			row.append(TimeService.getTime());

			analysis.add(row.toString());
		}

		analysis.forEach(p -> System.out.println(p));
	}
}
