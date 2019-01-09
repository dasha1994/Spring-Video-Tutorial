package spring.video.tutorial.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.video.tutorial.aop.objects.SomeService;
import spring.video.tutorial.impls.robot.ModelT1000;

public class Start {
    static ApplicationContext context = new ClassPathXmlApplicationContext("aop.context.xml");

    public static void main(String[] args) {
        SomeService service = (SomeService) context.getBean("someService");
        double val = service.getDoubleValue();
    }
}
