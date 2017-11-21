package com.github.jeromerocheteau;

import org.eclipse.paho.client.mqttv3.MqttMessage;

import com.github.jeromerocheteau.utils.TypeAdapter;
import com.github.jeromerocheteau.utils.TypeAdapterBuilder;

public class TypeMqttCallback<T extends Comparable<T>> extends DefaultMqttCallback {
	
	private String type;
	
	private TypeAdapter<T> adapter;
	
	public TypeMqttCallback(Class<T> type) {
		this.type = type.getSimpleName().toLowerCase();
		this.adapter = TypeAdapterBuilder.getInstance().get(type);
	}
	
	@Override
	public void messageArrived(String topic, MqttMessage message) {
		String string = new String(message.getPayload());
		try {
			T value = this.valueOf(string);
			parameters.put("type", type);
			parameters.put("value", value);
			this.status(true);
		} catch (Exception e) {
			this.status(false);
		}
	}

	private T valueOf(String string) throws Exception {
		if (adapter == null) {
			throw new Exception("undefined type '" + type + "'");
		} else {
			return adapter.valueOf(string);
		}
	}

}
