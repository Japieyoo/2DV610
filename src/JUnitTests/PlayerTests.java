package JUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import model.Player;

class PlayerTests {

	@Test
	public void setName_ShouldSetANameForThePlayer() {
		Player p = new Player();
		p.setName("Test");
		String actual = p.name;
		String expected = "Test";

		assertEquals(expected, actual);
	}
}
