package edu.oop.guild.creature;

import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.model.RealmType;

public class Creature {

	private int carryingCapacityKg;
	private RealmType nativeRealm;
	private String name;

	Creature(int carryingCapacityKg, RealmType nativeRealm, String name) {
		this.carryingCapacityKg = carryingCapacityKg;
		this.nativeRealm = nativeRealm;
		this.name = name;
	}

	public String name() {
		return name;
	}

	public int carryingCapacityKg() {
		return carryingCapacityKg;
	}

	public RealmType nativeRealm() {
		return nativeRealm;
	}

	public boolean canCarry(DeliveryRequest request) {
		if (request == null) {
			throw new NullPointerException("Can not evaluate an invalid request");
		}
		if (request.getWeightKg() <= carryingCapacityKg && request.getDestinationRealm() == nativeRealm) {
			return true;
		}
		return false;
	}

}
