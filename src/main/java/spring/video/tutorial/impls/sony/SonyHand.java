package spring.video.tutorial.impls.sony;


import org.springframework.stereotype.Component;
import spring.video.tutorial.interfaces.Hand;
@Component
public class SonyHand implements Hand {
	
	public void catchSomething(){
		System.out.println("Catched from Sony!!");
	}

}
