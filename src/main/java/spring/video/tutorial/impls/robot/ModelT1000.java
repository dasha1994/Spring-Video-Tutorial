package spring.video.tutorial.impls.robot;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.video.tutorial.interfaces.*;
@Component
public class ModelT1000 extends Model implements InitializingBean,DisposableBean {
	@Autowired(required = false)
	@Qualifier("toshibaHand")
	private Hand hand;

	//@Autowired
	private Leg leg;
	private Head head;

	@Bean
	@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public ModelT1000 modedl1(){
		return new ModelT1000();
	}

	public ModelT1000(String colour, int year, boolean soundEnabled) {
		System.out.println("only primitives");
		this.colour = colour;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	public ModelT1000(Hand hand, Leg leg, Head head) {
		System.out.println("only ref");
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public ModelT1000(Hand hand, Leg leg, Head head, String colour, int year, boolean soundEnabled) {
		System.out.println("the biggest");
		this.hand = hand;
		this.leg = leg;
		this.head = head;
		this.colour = colour;
		this.year = year;
		this.soundEnabled = soundEnabled;
		System.out.println(colour);
		System.out.println(year);
		System.out.println(soundEnabled);
	}

	public void init(){
		System.out.println("Init");
	}

	public void destroy(){
		System.out.println("Destroy");
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isSoundEnabled() {
		return soundEnabled;
	}

	public void setSoundEnabled(boolean soundEnabled) {
		this.soundEnabled = soundEnabled;
	}

	private String colour;
	private int year;
	private boolean soundEnabled;

	public ModelT1000() {
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}


	@Override
	public void action() {
		try{
			head.calc();
			hand.catchSomething();
			leg.go();
		}catch (Exception e){
			System.out.println(colour + " " + year + " " + soundEnabled );
		}

	}


	public void dance() {
		System.out.println("T1000 is dancing!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("T1000 afterPropertiesSet!");
	}
}
