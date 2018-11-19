package model;

public class Player {

	private String name;

	public void setName(String string) {
		name = string;
	}

	public String getName() {
		if (name == null) {
			throw new NullPointerException();
		}
		return name;
	}
}
