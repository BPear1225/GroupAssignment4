package edu.oop.guild.strategy;

import edu.oop.guild.model.DeliveryRequest;

public class ExpressDeliveryStrategy implements DeliveryCostStrategy{

	@Override
	public int estimateCoins(DeliveryRequest request) {
		if (request == null) {
			throw new NullPointerException("Must have a request to estimate cost");
		}
		if (request.isFragile()) {
			return 57;
		}
		return 47;
	}

}
