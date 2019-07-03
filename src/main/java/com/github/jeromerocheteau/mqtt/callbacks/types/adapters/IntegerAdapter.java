package com.github.jeromerocheteau.mqtt.callbacks.types.adapters;

public class IntegerAdapter implements TypeAdapter<Integer> {

	@Override
	public Integer valueOf(String string) throws Exception {
		return Integer.valueOf(string);
	}
	
}
