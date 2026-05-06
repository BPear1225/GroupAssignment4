package edu.oop.guild.notification;

public class LegacyOwlScroll {

	public String dispatchScroll(String destination, String message) {
		if (destination == null || destination.isBlank()) {
			throw new IllegalArgumentException("Scroll must have a destination");
		}
		if (message == null || message.isBlank()) {
			throw new IllegalArgumentException("Scroll must have a message");
		}
		return "Owl scroll sent to " + destination +": " + message;
	}

}
