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
	}

	@Test
	public void setName_ShouldSetANameForThePlayer() {

		p.setName("Test");
		String actual = p.name;
		String expected = "Test";

		assertEquals(expected, actual);
	}
}
