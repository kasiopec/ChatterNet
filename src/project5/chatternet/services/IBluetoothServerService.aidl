package project5.chatternet.services;

import java.util.List;
import java.util.Map;
import android.content.Intent;
import project5.chatternet.services.MessengerCallback;

interface IBluetoothServerService {
	List<String> getConnectedClients();
	boolean isConnected();
	boolean registerUser(in String mac, MessengerCallback callback);
	void removeUser(in String mac);
	void sendMessage(in String address, in Intent intent);
	List<String> getMasterSlaves();
	List<String> getSlaves(in String msMac);
	void registerCallback(MessengerCallback callback);
	void unregisterCallback(MessengerCallback callback);
	List<String> getChatMessages();
}