import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Jim on 4-3-2016.
 */
public class Triangle implements ApplicationContextAware, BeanNameAware {

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context;
    private String beanName;

    public void draw(){

        System.out.println(getPointA() + ", " + getPointB() + ", " + getPointC());
     }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.context = applicationContext;
    }

    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("BeanName: "+name);
    }
}