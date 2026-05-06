package edu.oop.guild.notification;

import edu.oop.guild.model.DeliveryPlan;
import edu.oop.guild.model.DeliveryRequest;

public class OwlScrollNotificationAdapter implements NotificationChannel {

	private LegacyOwlScroll scroll;
	
	public OwlScrollNotificationAdapter(LegacyOwlScroll legacyOwlScroll) {
		if (legacyOwlScroll == null) {
			throw new NullPointerException("Must have a scroll");
		}
		scroll = legacyOwlScroll;
	}

	public String send(DeliveryPlan plan) {
		if (plan == null) {
			throw new NullPointerException("Must have a plan to send a message");
		}
		String message =  plan.summary();
		DeliveryRequest request = plan.getRequest();
		String destination = request.getDestinationRealm().displayName();
		return scroll.dispatchScroll(destination, message);
	}

}
