package edu.oop.guild.model;

import edu.oop.guild.creature.Creature;

public class DeliveryPlan {

	private DeliveryRequest request;
	private Creature courier;
	private String sealLabel;
	private int price;

	public DeliveryPlan(DeliveryRequest request, Creature courier, String label, int price) {
		if (request == null) {
			throw new NullPointerException("Must have a request");
		}
		if (courier == null) {
			throw new NullPointerException("Must have someone to diliver the package");
		}
		if (label == null) {
			throw new NullPointerException("Must have a lable");
		}
		if (price < 0) {
			throw new IllegalArgumentException("Price can not be negative");
		}
		this.request = request;
		this.courier = courier;
		this.sealLabel = label;
		this.price = price;
	}

	public PackageType getRequest() {
		return request.getPackageType();
	}

	public String getCourier() {
		return courier.name();
	}

	public String getSealedLabel() {
		return sealLabel;
	}

	public int getPriceInCoins() {
		return price;
	}

	public String summary() {
		return getCourier() + " delivers " + getSealedLabel() + " for " + getPriceInCoins() + " coins";
	}

}
