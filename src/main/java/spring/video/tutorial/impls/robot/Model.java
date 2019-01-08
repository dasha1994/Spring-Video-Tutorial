package spring.video.tutorial.impls.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import spring.video.tutorial.interfaces.Hand;
import spring.video.tutorial.interfaces.Head;
import spring.video.tutorial.interfaces.Leg;
import spring.video.tutorial.interfaces.Robot;

/**
 * Created by Администратор on 07.01.2019.
 */
public abstract class Model implements Robot {
    @Autowired(required = false)
    @Qualifier("toshibaHand")
    private Hand hand;
    @Autowired
    private Leg leg;
    @Autowired
    private Head head;

    public Model() {
        System.out.println("Base model constructor");
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
}
