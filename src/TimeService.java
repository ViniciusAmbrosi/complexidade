
public class TimeService {
	
	private static long time;

	public static void startChronometer(){
		TimeService.time = System.currentTimeMillis();
	}
	
	public static void stopChronometer(){
		TimeService.time = System.currentTimeMillis() - TimeService.time;
	}
	
	public static String getTime(){
		return time + " milisegundos";
	}
}
