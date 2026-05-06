package edu.oop.guild.factory;

import edu.oop.guild.model.RealmType;

public class RealmFactoryProvider {

	public RealmFactory forRealm(RealmType realmType) {
		return switch (realmType) {
		case UNDERGROUND : {
			yield new UndergroundRealmFactory();
		}
		case SKY :{
			yield new SkyRealmFactory();
		}
		default:
			throw new NullPointerException("Must be a valid Realm");
		};
	}

}
