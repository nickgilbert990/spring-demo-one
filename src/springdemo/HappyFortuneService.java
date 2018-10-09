package springdemo;
import java.util.ArrayList;

public class HappyFortuneService implements IFortuneService {

	public ArrayList<String> fortunesList = new ArrayList<String>();
	
	public HappyFortuneService(String f1, String f2, String f3) {
		fortunesList.add(f1);
		fortunesList.add(f2);
		fortunesList.add(f3);
	}
	
	public HappyFortuneService() {

	}
	
	@Override
	public String getFortune() {
	
		int result = ((int) (Math.random()*(3 - 0))) + 0;
		return (String) fortunesList.get(result);

	}

}
