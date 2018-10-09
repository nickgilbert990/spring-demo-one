package springdemo;

public class TrackCoach implements ICoach {

	private IFortuneService fortuneService;
		
	public TrackCoach(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach() {
		 
	}

	@Override
	public String getDailyWorkout() {
		 
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {

		return "Just do it: " + fortuneService.getFortune();
	}

}
