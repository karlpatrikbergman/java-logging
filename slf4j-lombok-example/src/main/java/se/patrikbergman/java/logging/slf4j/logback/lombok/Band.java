package se.patrikbergman.java.logging.slf4j.logback.lombok;

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
