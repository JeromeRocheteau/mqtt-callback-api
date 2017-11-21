package com.github.jeromerocheteau.utils;

public class FloatAdapter implements TypeAdapter<Float> {

	@Override
	public Float valueOf(String string) throws Exception {
		return Float.valueOf(string);
	}
	
}
