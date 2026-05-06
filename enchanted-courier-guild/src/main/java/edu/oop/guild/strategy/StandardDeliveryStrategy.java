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
		switch (request.getPackageType()) {
		case FOOD:
			break;
		case POTION:
			price += 5;
			break;
		case ARTIFACT:
			price += 17;
			break;

		default:
			break;
		}
		switch (request.getDestinationRealm()) {
		case SKY:
			price += 7;
			break;
		case UNDERGROUND:
			price += 0;
			break;
		default:

			break;
		}
		price += request.getWeightKg() * 1;
		price += request.getDistanceLeagues() * 2;

		return price;
	}

}
