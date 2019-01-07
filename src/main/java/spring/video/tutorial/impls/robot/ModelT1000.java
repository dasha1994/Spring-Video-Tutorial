package spring.video.tutorial.impls.robot;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import spring.video.tutorial.interfaces.*;

public class ModelT1000 extends Model implements Robot,InitializingBean,DisposableBean {

	private Hand hand;
	private Leg leg;
	private Head head;

	public String getColour() {
		return colour;
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
	public void fire() {
		head.calc();
		hand.catchSomething();
		leg.go();
	}


	public void dance() {
		System.out.println("T1000 is dancing!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("T1000 afterPropertiesSet!");
	}
}
