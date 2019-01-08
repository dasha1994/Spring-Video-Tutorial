package spring.video.tutorial.impls.pool;

import spring.video.tutorial.interfaces.Robot;
import spring.video.tutorial.interfaces.RobotPool;

import java.util.Collection;

public class T1000Pool implements RobotPool {

    private Collection<Robot> robotCollection;

    public T1000Pool(Collection<Robot> robotCollection){
        this.robotCollection = robotCollection;
    }

    public void setRobotCollection(Collection<Robot> robotCollection){
        this.robotCollection = robotCollection;
    }
    @Override
    public Collection<Robot> getRobotCollection() {
        return null;
    }

    public void action(){
        for(Robot robot : robotCollection){
            robot.action();
        }
    }
}
