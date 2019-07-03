package com.github.jeromerocheteau.mqtt.callbacks.types;

public class DataType implements Type {

	private Class<?> clazz;
	
	<T extends Comparable<T>> DataType(Class<T> clazz) {
		this.clazz = clazz; 
	}
	
	@Override
	public String getName() {
		return this.clazz.getCanonicalName();
	}

	@Override
	public int compareTo(Type o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
