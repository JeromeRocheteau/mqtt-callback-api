package com.github.jeromerocheteau.utils;

public class IntegerAdapter implements TypeAdapter<Integer> {

	@Override
	public Integer valueOf(String string) throws Exception {
		return Integer.valueOf(string);
	}
	
}
