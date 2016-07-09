package seasky.spring.boot;

import org.springframework.util.Assert;

import seasky.spring.boot.controller.GreetingController;
import seasky.spring.boot.model.FruitModel;

import javax.validation.constraints.AssertTrue;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/5/11.
 */
public class GreetingControllerTest {
    FruitModel model = new FruitModel();
    GreetingController controller = new GreetingController();

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testGreeting() throws Exception {

    }

    @org.junit.Test
    public void testGetFruits() throws Exception {
        Assert.isTrue(controller.getFruits(null).size() > 0);
    }

    @org.junit.Test
    public void testGetFruitByTag() throws Exception {
        org.junit.Assert.assertEquals("苹果",controller.getFruitByTag("apple").get("fruit"));
    }
}