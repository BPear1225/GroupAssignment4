package edu.oop.guild.model;

public enum PackageType {
	POTION("Snack crate"), 
	FOOD("Potion case"), 
	ARTIFACT("Ancient artifact")
	;
	
	private final String label;

	private PackageType(String lable) {
		this.label = lable;
	}

	public String label() {
		return label;
	}

}
