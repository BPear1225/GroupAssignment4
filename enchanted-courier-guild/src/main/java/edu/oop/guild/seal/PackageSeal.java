package edu.oop.guild.seal;

public class PackageSeal {
	private int durability;
	private String seal;

	public String apply(String contents) {
		return seal + " " + contents + " " + seal;
	}

	public PackageSeal(int durability, String seal) {
		super();
		this.durability = durability;
		this.seal = seal;
	}

	public int durability() {
		return durability;
	}
}
