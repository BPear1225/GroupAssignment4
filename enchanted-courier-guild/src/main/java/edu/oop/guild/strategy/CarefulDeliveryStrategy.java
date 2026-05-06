package edu.oop.guild.strategy;

import edu.oop.guild.model.DeliveryRequest;

public class CarefulDeliveryStrategy implements DeliveryCostStrategy {

	@Override
	public int estimateCoins(DeliveryRequest request) {
		if (request == null) {
			throw new NullPointerException("Must have a request to estimate cost");
		}
		int price = 15;
		switch (request.getPackageType()) {

		case POTION:
			price += 5;
			break;

		case ARTIFACT:
			price += 17;
			break;

		default:
			break;
		}

		price += 7;
		price += request.getWeightKg() * 1;
		price += request.getDistanceLeagues() * 2;
		return price;
	}

}
