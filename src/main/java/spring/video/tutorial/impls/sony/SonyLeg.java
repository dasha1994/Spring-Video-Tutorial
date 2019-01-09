package spring.video.tutorial.impls.sony;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import spring.video.tutorial.interfaces.Leg;
@Component
@Lazy
public class SonyLeg implements Leg {
	
	public void go(){
		System.out.println("Go to Sony!");
	}

}
