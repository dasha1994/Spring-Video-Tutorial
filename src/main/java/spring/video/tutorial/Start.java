package spring.video.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.video.tutorial.impls.pool.T1000Pool;
import spring.video.tutorial.impls.robot.ModelT1000;
import spring.video.tutorial.interfaces.Robot;
import spring.video.tutorial.interfaces.RobotConveyor;


public class Start {
	static ApplicationContext context = new ClassPathXmlApplicationContext("application.context.xml");

	public static void main(String[] args) {
		baseExample();
	}
	private static void baseExample(){
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
		t1000.dance();
		//t1000.action();
		t1000.getHand().catchSomething();
		System.out.println("");
	}
	private static void robotsPool(){
		T1000Pool t1000Pool = (T1000Pool) context.getBean("t1000pool");
		t1000Pool.action();
	}
	private static void createRobot(){
		RobotConveyor t100Conveyor = (RobotConveyor) context.getBean("t1000conveyor");
		Robot term1 = t100Conveyor.createRobot();
		Robot term2 = t100Conveyor.createRobot();
		Robot term3 = t100Conveyor.createRobot();

		System.out.println("term1 "+term1);
		System.out.println("term2 "+term2);
		System.out.println("term3 "+term3);

	}
}
