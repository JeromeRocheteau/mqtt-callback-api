package com.github.jeromerocheteau.mqtt.callbacks.types.adapters;

public class ShortAdapter implements TypeAdapter<Short> {

	@Override
	public Short valueOf(String string) throws Exception {
		return Short.valueOf(string);
	}
	
}
