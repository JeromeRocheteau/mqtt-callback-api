package com.github.jeromerocheteau.mqtt.callbacks.types.adapters;

import java.net.URI;

public class UriAdapter implements TypeAdapter<URI> {

	@Override
	public URI valueOf(String string) throws Exception {
		return URI.create(string);
	}
	
}
