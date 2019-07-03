package com.github.jeromerocheteau.mqtt.callbacks.types.adapters;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TypeAdapterBuilder {

	private static TypeAdapterBuilder instance;
	
	public static TypeAdapterBuilder getInstance() {
		if (instance == null) {
			instance = new TypeAdapterBuilder();
			instance.register(String.class, new StringAdapter());
			instance.register(Boolean.class, new BooleanAdapter());
			instance.register(Short.class, new ShortAdapter());
			instance.register(Integer.class, new IntegerAdapter());
			instance.register(Long.class, new LongAdapter());
			instance.register(Byte.class, new ByteAdapter());
			instance.register(Float.class, new FloatAdapter());
			instance.register(Double.class, new DoubleAdapter());
			instance.register(URI.class, new UriAdapter());
			instance.register(UUID.class, new UuidAdapter());
		}
		return instance;
	}
	
	private Map<String, TypeAdapter<?>> adapters; 
	
	public <T extends Comparable<T>> void register(Class<T> type, TypeAdapter<T> adapter) {
		String name = type.getSimpleName().toLowerCase();
		adapters.put(name, adapter);
	}
	
	@SuppressWarnings("unchecked")
	public <T extends Comparable<T>> TypeAdapter<T> get(Class<T> type) {
		String name = type.getSimpleName().toLowerCase();
		return (TypeAdapter<T>) adapters.get(name);
	}
	
	private TypeAdapterBuilder() {
		adapters = new HashMap<String, TypeAdapter<?>>();
	}
	
}
