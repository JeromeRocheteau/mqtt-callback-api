package com.github.jeromerocheteau.utils;

public class LongAdapter implements TypeAdapter<Long> {

	@Override
	public Long valueOf(String string) throws Exception {
		return Long.valueOf(string);
	}
	
}
