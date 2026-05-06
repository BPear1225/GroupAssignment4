package edu.oop.guild.model;

public class DeliveryRequest {
	
	private PackageType packageType;
	private int weightKg;
	private int distanceLeagues;
	private RealmType destinationRealm;
	private boolean fragile;

	public DeliveryRequest(PackageType packageType, int weightKg, int distanceLeagues, RealmType destinationRealm,
			boolean fragile) {
		if (packageType == null) {
			throw new NullPointerException("Must have a Package Type");
		}
		if (weightKg <=0) {
			throw new IllegalArgumentException("Must have a positive weight");
		}
		if (distanceLeagues <=0) {
			throw new IllegalArgumentException("Must have a positive distance");
		}
		if (destinationRealm == null) {
			throw new NullPointerException("Must have a destination");
		}
		this.packageType = packageType;
		this.weightKg = weightKg;
		this.distanceLeagues = distanceLeagues;
		this.destinationRealm = destinationRealm;
		this.fragile = fragile;
	}

	public PackageType getPackageType() {
		return packageType;
	}

	public int getWeightKg() {
		return weightKg;
	}

	public int getDistanceLeagues() {
		return distanceLeagues;
	}

	public RealmType getDestinationRealm() {
		return destinationRealm;
	}

	public boolean isFragile() {
		return fragile;
	}
	
	@Override
	public String toString() {
		return packageType.label()+ " to " + destinationRealm.displayName();
	}

}
