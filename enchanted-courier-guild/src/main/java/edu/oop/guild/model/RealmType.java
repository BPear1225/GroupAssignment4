package edu.oop.guild.model;

public enum RealmType {
	SKY("Sky Kingdom"), 
	UNDERGROUND("Underground Market")
	;
	private RealmType(String name) {
		this.displayName = name;
	}

	private final String displayName;
	
	public String displayName() {
		return displayName;
	}

}
