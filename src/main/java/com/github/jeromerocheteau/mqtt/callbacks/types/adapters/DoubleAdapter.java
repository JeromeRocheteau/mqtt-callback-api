package com.github.jeromerocheteau.mqtt.callbacks.types.adapters;

public class DoubleAdapter implements TypeAdapter<Double> {

	@Override
	public Double valueOf(String string) throws Exception {
		return Double.valueOf(string);
	}
	
}
