package springdemo;

public class MyApp {

	public static void main(String[] args) {
		 
		ICoach theBaseballCoach = new BaseballCoach();
		ICoach theTrackCoach = new TrackCoach();
		
		System.out.println(theTrackCoach.getDailyWorkout());

	}

}
