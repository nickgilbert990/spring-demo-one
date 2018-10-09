package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from the spring container
		ICoach theCoach = context.getBean("myCricketCoach", ICoach.class);	
		ILiterals theLiterals = context.getBean("myCricketCoach", ILiterals.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theLiterals.getEmail());
		
		System.out.println(theLiterals.getTeam());
		
		// close the application context
		context.close();

	}

}
