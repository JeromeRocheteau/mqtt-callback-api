package com.github.jeromerocheteau;

import java.util.Map;

import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class GuardMqttCallback extends DefaultMqttCallback implements MqttCallback {

	private DefaultMqttCallback testCallback;
	
	private DefaultMqttCallback successCallback;
	
	private DefaultMqttCallback failureCallback;
		
	public GuardMqttCallback(DefaultMqttCallback testCallback, DefaultMqttCallback successCallback) {
		this.testCallback = testCallback;
		this.successCallback = successCallback;
	}
	
	public GuardMqttCallback(DefaultMqttCallback testCallback, DefaultMqttCallback successCallback, DefaultMqttCallback failureCallback) {
		this.testCallback = testCallback;
		this.successCallback = successCallback;
		this.failureCallback = failureCallback;
	}
	
	@Override
	public void embedd(Map<String, Object> parameters, boolean root) {
		super.embedd(parameters, root);
		testCallback.embedd(parameters, false);
		successCallback.embedd(parameters, false);
		if (failureCallback != null) {
			failureCallback.embedd(parameters, false);
		}
	}
	
	@Override
	public final void messageArrived(String topic, MqttMessage message) {
		testCallback.messageArrived(topic, message);
		if (testCallback.status()) {
			successCallback.messageArrived(topic, message);
			this.status(successCallback.status());
		} else if (failureCallback != null) {
			failureCallback.messageArrived(topic, message);
			this.status(failureCallback.status());
		}
		if (this.root()) {
			parameters.clear();
		}
	}

}
