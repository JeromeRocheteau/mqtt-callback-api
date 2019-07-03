package com.github.jeromerocheteau.mqtt.callbacks.types.adapters;

import java.util.UUID;

public class UuidAdapter implements TypeAdapter<UUID> {

	@Override
	public UUID valueOf(String string) throws Exception {
		return UUID.fromString(string);
	}
	
}
