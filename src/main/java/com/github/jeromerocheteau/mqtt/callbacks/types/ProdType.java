package com.github.jeromerocheteau.mqtt.callbacks.types;

import java.util.Map;
import java.util.TreeMap;

public class ProdType implements Type {

	private String name;
	
	private Format format;

	private Map<String, Feature> features;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Format getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format = format;
	}

	public Map<String, Feature> getFeatures() {
		return features;
	}

	public void setFeatures(Map<String, Feature> features) {
		this.features = features;
	}

	public Feature getFeature(String name) {
		return features.get(name);
	}

	public void setFeature(String name, Type type) {
		features.put(name, new Feature(name, type));
	}
	
	public ProdType(String name, Format format) {
		super();
		this.name = name;
		this.format = format;
		this.features = new TreeMap<String, Feature>();
	}

	@Override
	public int compareTo(Type o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
