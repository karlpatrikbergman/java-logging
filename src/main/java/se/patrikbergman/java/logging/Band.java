package se.patrikbergman.java.logging;

class Band {
	private final String name;
	private final String descriptions;

	Band(String name, String descriptions) {
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
