package com.github.jeromerocheteau.utils;

import java.net.URI;

public class UriAdapter implements TypeAdapter<URI> {

	@Override
	public URI valueOf(String string) throws Exception {
		return URI.create(string);
	}
	
}
