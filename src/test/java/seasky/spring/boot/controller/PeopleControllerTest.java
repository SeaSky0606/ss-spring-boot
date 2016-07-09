package seasky.spring.boot.controller;

import org.junit.Test;

public class PeopleControllerTest {
	PeopleController controller = new PeopleController();

	@Test
	public void testGreeting() {
		System.out.println(controller.greeting("hhh"));
	}

	@Test
	public void testGetAllPeople() {
		System.out.println(controller.getAllPeople(""));
		}

	@Test
	public void testGetPeopleById() {
		System.out.println(controller.getPeopleById(1, null));
	}

}
