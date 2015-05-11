package se.patrikbergman.java.logging;

public class Band {
	private final String name;
	private final String descriptions;

	public Band(String name, String descriptions) {
		this.name = name;
		this.descriptions = descriptions;
	}

	public String getName() {
		return name;
	}

	public String getDescriptions() {
		return descriptions;
	}

	@Override
	public String toString() {
		return this.getName();
	}
}
