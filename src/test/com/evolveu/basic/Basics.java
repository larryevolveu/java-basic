package test.com.evolveu.basic;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Basics {

    @Test
    public void variables() {

        int ii = 5;
        long ll = 123456789;
        double dd = 1.23456;
        boolean bb = true;
        byte by = 12;
        String ss = "A String";

        String val = "Value is: " + ii + ll + dd + bb + by + ss;
//        System.out.println(val);

        Assert.assertEquals("Value is: 51234567891.23456true12A String", val);

    }

    @Test
    public void dataStructures() {

        int bunchOfI[] = new int[3];
        for(int i = 0; i < bunchOfI.length; i++) {
            System.out.println("--Loop:" + i);
        }

        Map<String, String> map = new HashMap<String, String>();
        map.put("ab", "Alberta");
        map.put("sk", "Saskatchewan");

        Assert.assertEquals("Alberta", map.get("ab"));

    }

    @Test
    public void workingWithObjects() {

        String name = this.getClass().getName();
        System.out.println("Class Name: " + name);

    }

}
