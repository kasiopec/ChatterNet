package project5.chatternet.services;

interface MessengerCallback {
	void update(String message);
	void newMessage(String from, String message);
}