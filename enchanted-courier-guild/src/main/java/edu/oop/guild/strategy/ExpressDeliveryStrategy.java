package edu.oop.guild.strategy;

import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.model.PackageType;
import edu.oop.guild.model.RealmType;

public class ExpressDeliveryStrategy implements DeliveryCostStrategy {

	@Override
	public int estimateCoins(DeliveryRequest request) {
		if (request == null) {
			throw new NullPointerException("Must have a request to estimate cost");
		}
		int price = 24;
		if (request.isFragile()) {
			price += 10;
		}
		if (request.getPackageType() == PackageType.POTION) {
			price += 5;
		}
		if (request.getPackageType() == PackageType.ARTIFACT){
			price += 17;
		}
		if (request.getDestinationRealm() == RealmType.SKY) {
			price += 7;
		}

		price += request.getWeightKg() * 1;
		price += request.getDistanceLeagues() * 2;
		return price;
	}

}
