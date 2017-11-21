package com.github.jeromerocheteau;

import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class MqttCallbackWrapper extends DefaultMqttCallback {

	private MqttCallback callback;
	
	public MqttCallbackWrapper(MqttCallback callback) {
		this.callback = callback;
	}
	
	@Override
	public void messageArrived(String topic, MqttMessage message) {
		try {
			this.callback.messageArrived(topic, message);
			this.status(true);
		} catch (Exception e) {
			this.status(false);
		}
	}

}
