package spring.video.tutorial.impls.sony;


import org.springframework.stereotype.Component;
import spring.video.tutorial.interfaces.Head;
@Component
public class SonyHead implements Head {
	
	public void calc(){
		System.out.println("Thinking about Sony...");
	}

}
