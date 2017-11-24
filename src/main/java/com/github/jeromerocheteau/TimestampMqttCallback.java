package com.github.jeromerocheteau;

import org.eclipse.paho.client.mqttv3.MqttMessage;

public class TimestampMqttCallback extends DefaultMqttCallback {

	private String name;
	
	public TimestampMqttCallback(String name) {
		this.name = name;
	}
	
	@Override
	public void messageArrived(String topic, MqttMessage message) {
		parameters.put(name, System.currentTimeMillis());
		this.status(true);
	}

}
