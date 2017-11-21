package com.github.jeromerocheteau.utils;

public class DoubleAdapter implements TypeAdapter<Double> {

	@Override
	public Double valueOf(String string) throws Exception {
		return Double.valueOf(string);
	}
	
}
