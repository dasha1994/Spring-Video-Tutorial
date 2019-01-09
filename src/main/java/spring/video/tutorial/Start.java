package spring.video.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.video.tutorial.impls.pool.T1000Pool;
import spring.video.tutorial.impls.robot.Model;
import spring.video.tutorial.impls.robot.ModelT1000;
import spring.video.tutorial.impls.sony.SonyHand;
import spring.video.tutorial.impls.toshiba.ToshibaHand;
import spring.video.tutorial.interfaces.Hand;
import spring.video.tutorial.interfaces.Robot;
import spring.video.tutorial.interfaces.RobotConveyor;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Start {
	static ApplicationContext context = new ClassPathXmlApplicationContext("application.context.xml");

	public static void main(String[] args) {
		ModelT1000 t1000 = (ModelT1000) context.getBean("model1");
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

	private void ex(Model robot){
		Hand h = new ToshibaHand();
		robot.setHand(h);
	}

	private Model privateNew(Model robot){
		return new ModelT1000();
	}

	private void exampleMap(){
		Map<String, Integer> newmap = new HashMap<>();
		newmap.put("First",1);
		newmap.put("Second",2);
		Set<Map.Entry<String, Integer>> ss = newmap.entrySet();
		for(Map.Entry<String, Integer> entry : ss){
			System.out.println(entry);
		}

	}
}
