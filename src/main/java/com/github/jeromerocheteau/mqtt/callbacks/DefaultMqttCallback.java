package com.github.jeromerocheteau.mqtt.callbacks;

import java.util.Map;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public abstract class DefaultMqttCallback implements MqttCallback {

	private boolean status;
	
	private boolean root;
	
	protected Map<String, Object> parameters;
	
	public void status(boolean status) {
		this.status = status;
	}
	
	public boolean status() {
		return status;
	}

	protected boolean root() {
		return root;
	}
	
	public void embedd(Map<String, Object> parameters, boolean root) {
		this.parameters = parameters;
		this.root = root;
	}
	
	@Override
	public void connectionLost(Throwable throwable) { }

	@Override
	public void deliveryComplete(IMqttDeliveryToken token) { }
	
	@Override
	public abstract void messageArrived(String topic, MqttMessage message);
	
}
