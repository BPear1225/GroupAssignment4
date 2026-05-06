package edu.oop.guild.notification;

import edu.oop.guild.model.DeliveryPlan;

public interface NotificationChannel {

	public String send(DeliveryPlan plan);

}
