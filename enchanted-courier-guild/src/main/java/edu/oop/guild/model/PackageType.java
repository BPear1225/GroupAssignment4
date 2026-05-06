package edu.oop.guild.model;

public enum PackageType {
	POTION("Potion case"), 
	FOOD("Snack crate"), 
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
