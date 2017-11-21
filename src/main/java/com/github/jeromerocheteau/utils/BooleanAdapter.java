package com.github.jeromerocheteau.utils;

public class BooleanAdapter implements TypeAdapter<Boolean> {

	@Override
	public Boolean valueOf(String string) throws Exception {
		return Boolean.valueOf(string);
	}
	
}
