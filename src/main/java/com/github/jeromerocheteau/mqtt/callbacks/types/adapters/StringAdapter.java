package com.github.jeromerocheteau.mqtt.callbacks.types.adapters;

public class StringAdapter implements TypeAdapter<String> {

	@Override
	public String valueOf(String string) throws Exception {
		return string;
	}
	
}
