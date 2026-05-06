package edu.oop.guild.service;

import edu.oop.guild.creature.Creature;
import edu.oop.guild.factory.RealmFactory;
import edu.oop.guild.log.GuildLog;
import edu.oop.guild.model.DeliveryPlan;
import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.seal.PackageSeal;
import edu.oop.guild.strategy.DeliveryCostStrategy;

public class DeliveryPlanner {

	private RealmFactory factory;
	private DeliveryCostStrategy strategy;
	private GuildLog log;

	public DeliveryPlanner(RealmFactory factory, DeliveryCostStrategy strategy, GuildLog log) {
		if (factory == null) {
			throw new NullPointerException("Must have a realm factory");
		}
		if (strategy == null) {
			throw new NullPointerException("Must have a cost strategy");
		}
		if (log == null) {
			throw new NullPointerException("Must have a guild log");
		}
		this.factory = factory;
		this.strategy = strategy;
		this.log = log;
	}

	public DeliveryPlan plan(DeliveryRequest request) {
		if (request == null) {
			throw new NullPointerException("Must have a request to plan a delivery");
		}
		Creature courier = factory.createCourier();
		if (!courier.canCarry(request)) {
			throw new IllegalStateException(
					courier.name() + " cannot carry this package to " + request.getDestinationRealm().displayName());
		}
		PackageSeal seal = factory.createSeal();
		String contents = request.getPackageType().label() + " to " + request.getDestinationRealm().displayName();
		String sealedLabel = seal.apply(contents);
		int price = strategy.estimateCoins(request);
		DeliveryPlan plan = new DeliveryPlan(request, courier, sealedLabel, price);
		log.record(plan.summary());
		return plan;
	}

}