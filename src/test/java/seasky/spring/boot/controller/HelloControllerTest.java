package seasky.spring.boot.controller;

import org.junit.Test;

public class HelloControllerTest {
	HelloController controll = new HelloController();

	@Test
	public void testHello() {
		controll.hello(null);
	}

	@Test
	public void testSave() {
		String ret = controll.save("Jack", 11, null);
		System.out.println("ret=" + ret);
	}

}
