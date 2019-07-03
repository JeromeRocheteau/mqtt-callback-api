package com.github.jeromerocheteau.mqtt.callbacks.types.adapters;

public class LongAdapter implements TypeAdapter<Long> {

	@Override
	public Long valueOf(String string) throws Exception {
		return Long.valueOf(string);
	}
	
}
