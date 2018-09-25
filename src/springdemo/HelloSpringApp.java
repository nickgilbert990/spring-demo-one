package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from the spring container
		ICoach theCoach = context.getBean("myCoach", ICoach.class);		
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		
		// close the application context
		context.close();
	}

}
