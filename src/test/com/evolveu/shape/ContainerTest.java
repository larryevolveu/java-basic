package test.com.evolveu.shape;

import com.evolveu.shape.Circle;
import com.evolveu.shape.Rectangle;
import com.evolveu.shape.Shape;
import org.junit.Test;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ContainerTest {

    @Test
    public void containerArea() {

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(2.0,3.0));
        shapes.add(new Circle(5.));

        Logger l = Logger.getLogger(ContainerTest.class.getName());
        l.info("Where are you going to print?");
        l.info(l.getName());
        l.info(this.toString());
        l.info(this.getClass().getName());


        System.out.println("The size is: " + shapes.size());

        Shape containers[] = new Shape[shapes.size()];


//        warning("There is life out there");

        for(int i = 0; i < containers.length; i++ ) {

        }



//        Shape s = new Rectangle(3.,4.);
//        Assert.assertEquals(12,s.area(),.0001);
    }


}
