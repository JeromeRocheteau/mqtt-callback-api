package com.github.jeromerocheteau.mqtt.callbacks.types.adapters;

public interface TypeAdapter<T extends Comparable<T>> {
	
	public T valueOf(String string) throws Exception;
	

}
