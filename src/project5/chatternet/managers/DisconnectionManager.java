package project5.chatternet.managers;

import project5.chatternet.routing.IRoutingProtocol;
import project5.chatternet.services.DeviceType;

public class DisconnectionManager {
	public static void handleLostConnection(IRoutingProtocol protocol, DeviceType type) {
		switch(type) {
			case SLAVE:
				break;
			case MASTER_SLAVE:
				break;
			default:
				break;
		}
	}
}
