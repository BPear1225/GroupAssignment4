package edu.oop.guild.strategy;

import edu.oop.guild.model.DeliveryRequest;

public class CarefulDeliveryStrategy implements DeliveryCostStrategy {

	@Override
	public int estimateCoins(DeliveryRequest request) {
		return switch (request.getPackageType()) {
		case FOOD: {

			yield 28;
		}
		case POTION: {

			yield 33;
		}
		case ARTIFACT: {

			yield 45;
		}
		default:
			throw new NullPointerException("Must have a request to estimate cost");
		};
	}

}
