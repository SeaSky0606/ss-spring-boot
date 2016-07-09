package hello.model;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

import seasky.spring.boot.model.FruitModel;

public class FruitModelTest {
	Logger LOG = Logger.getLogger("FRUIT-TEST");
	FruitModel model = new FruitModel();

	@Test
	public void testGetFruits() {
		System.out.println(model.getFruits());
	}

	@Test
	public void testGetFruitByTag() {
		LOG.info(model.getFruitByTag("banana"));
	}

	@Test
	public void testTest1() {
		model.test1();
	}

	@Test
	public void testTest2() {
		model.test2();
	}

}
