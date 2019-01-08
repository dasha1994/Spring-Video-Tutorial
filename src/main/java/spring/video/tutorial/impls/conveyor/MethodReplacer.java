package spring.video.tutorial.impls.conveyor;

import spring.video.tutorial.impls.robot.ModelT1000;
import sun.reflect.MethodAccessor;

import java.lang.reflect.Method;

public class MethodReplacer implements org.springframework.beans.factory.support.MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        return new ModelT1000("black",1999, false);
    }
}
