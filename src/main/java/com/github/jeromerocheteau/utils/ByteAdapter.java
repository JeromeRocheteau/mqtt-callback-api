package com.github.jeromerocheteau.utils;

public class ByteAdapter implements TypeAdapter<Byte> {

	@Override
	public Byte valueOf(String string) throws Exception {
		return Byte.valueOf(string);
	}
	
}
