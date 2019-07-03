package com.github.jeromerocheteau.mqtt.callbacks.types.adapters;

public class ByteAdapter implements TypeAdapter<Byte> {

	@Override
	public Byte valueOf(String string) throws Exception {
		return Byte.valueOf(string);
	}
	
}
