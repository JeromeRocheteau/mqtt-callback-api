package com.github.jeromerocheteau.utils;

public interface TypeAdapter<T extends Comparable<T>> {
	
	public T valueOf(String string) throws Exception;
	

}
