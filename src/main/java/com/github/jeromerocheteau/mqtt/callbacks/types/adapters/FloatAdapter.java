package com.github.jeromerocheteau.mqtt.callbacks.types.adapters;

public class FloatAdapter implements TypeAdapter<Float> {

	@Override
	public Float valueOf(String string) throws Exception {
		return Float.valueOf(string);
	}
	
}
