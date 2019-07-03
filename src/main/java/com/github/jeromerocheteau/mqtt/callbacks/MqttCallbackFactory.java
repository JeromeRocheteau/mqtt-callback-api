package com.github.jeromerocheteau.mqtt.callbacks;

import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttTopic;

public class MqttCallbackFactory {

	public static MqttCallbackFactory getInstance() {
		return new MqttCallbackFactory();
	}

	private MqttCallbackFactory() { }
	
	public DefaultMqttCallback wrap(MqttCallback callback) throws Exception {
		if (callback instanceof DefaultMqttCallback) {
			return (DefaultMqttCallback) callback;
		} else {
			return new MqttCallbackWrapper(callback);
		}
	}
	
	public DefaultMqttCallback topic(String topic) throws Exception {
		MqttTopic.validate(topic, false);
		return new TopicMqttCallback(topic);
	}
	
	public DefaultMqttCallback topic(String topic, boolean allowed) throws Exception {
		MqttTopic.validate(topic, allowed);
		return new TopicMqttCallback(topic);
	}
	
	public DefaultMqttCallback guard(DefaultMqttCallback testCallback, DefaultMqttCallback successCallback) throws Exception {
		return new GuardMqttCallback(testCallback, successCallback);
	}
	
	public DefaultMqttCallback guard(DefaultMqttCallback testCallback, DefaultMqttCallback successCallback, DefaultMqttCallback failureCallback) throws Exception {
		return new GuardMqttCallback(testCallback, successCallback, failureCallback);
	}
	
}
