package edu.oop.guild.strategy;

import edu.oop.guild.model.DeliveryRequest;

public class StandardDeliveryStrategy implements DeliveryCostStrategy {

	@Override
	public int estimateCoins(DeliveryRequest request) {
		if (request == null) {
			throw new NullPointerException("Must have a request to estimate cost");
		}
		int price = 3;
		if (request.isFragile()) {
			price += 5;
		}
		price += 7;	

		price += request.getWeightKg() * 1;
		price += request.getDistanceLeagues() * 2;

		return price;
	}

}
