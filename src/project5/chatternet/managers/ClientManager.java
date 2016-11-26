package project5.chatternet.managers;

import project5.chatternet.routing.IRoutingProtocol;
import project5.chatternet.services.BluetoothSocketDevice;

public class ClientManager {
	/**
	 * Called when a slave loses connection to a master/slave
	 * @param protocol The protocol dealing with this device
	 * @param device The device that lost connection
	 * @return True if the message was successfully sent to the server
	 */
	public static boolean lostConnectionToSlave(IRoutingProtocol protocol, BluetoothSocketDevice device) {
		return true;
	}
}
