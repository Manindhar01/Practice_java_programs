package com.mani.java9.PrivateMethods;

public interface SendNotification {
	default void sendNotifcation() {
		establishConnection();
		System.out.println("sending multiple notification");
	}
	default void sendNotifications() {
		establishConnection();
		System.out.println("Sending Notification");
	}
	private void establishConnection() {
		System.out.println("Establishing a connection");
		
	}
	
	
	

}
