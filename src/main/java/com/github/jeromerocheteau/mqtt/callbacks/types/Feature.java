package com.github.jeromerocheteau.mqtt.callbacks.types;

public class Feature {

	private String name;
	
	private Type type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Feature(String name, Type type) {
		super();
		this.name = name;
		this.type = type;
	}
	
}
