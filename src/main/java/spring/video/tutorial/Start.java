package spring.video.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.video.tutorial.impls.robot.ModelT1000;


public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.context.xml");
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
		t1000.dance();
		t1000.fire();

//		ModelT1000 t1001 = (ModelT1000) context.getBean("t1000");
//		ModelT1000 t1002 = (ModelT1000) context.getBean("t1000");

		System.out.println(t1000.getHead());
//		System.out.println(t1001.getHead());

//		System.out.println(t1002.getHead());

	}
}
