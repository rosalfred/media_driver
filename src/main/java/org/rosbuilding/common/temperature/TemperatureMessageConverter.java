package org.rosbuilding.common.temperature;

import smarthome_comm_msgs.Command;
import sensor_msgs.Temperature;

import org.ros.node.ConnectedNode;
import org.rosbuilding.common.MessageConverter;

public class TemperatureMessageConverter implements MessageConverter<Temperature> {
    public Temperature toMessage(ConnectedNode node, Command command) {
        throw new RuntimeException("Not implemented!");
    }
}
