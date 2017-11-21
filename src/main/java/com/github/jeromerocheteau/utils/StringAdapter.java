package com.github.jeromerocheteau.utils;

public class StringAdapter implements TypeAdapter<String> {

	@Override
	public String valueOf(String string) throws Exception {
		return string;
	}
	
}
