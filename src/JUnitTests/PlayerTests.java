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
	public void setName_ShouldSetANameForThePlayer() {
		String actual = p.name;
		String expected = "Test";

		assertEquals(expected, actual);
	}
	@Test
	public void getName_ShouldReturnTheNameOfThePlayer() {
		p.getName();
		String actual = p.name;
		String expected = "Test";

		assertEquals(expected, actual);
	}
}
