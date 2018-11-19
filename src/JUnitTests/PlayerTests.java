package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.Player;

class PlayerTests {
	Player p;

	@BeforeEach
	public void setUp() {
		p = new Player();
		p.setName("Test");
	}

	@Test
	public void getName_ShouldThrowErrorWhenNameIsNotSet() {
		Player fail = new Player();
		boolean thrown = false;

		try {
			fail.getName();
		} catch (Exception e) {
			thrown = true;
		}
		assertTrue(thrown);
	}

	@Test
	public void getName_ShouldReturnTest() {
		String actual = p.getName();
		String expected = "Test";

		assertEquals(expected, actual);
	}
}
