package edu.oop.guild.factory;

import edu.oop.guild.creature.Creature;
import edu.oop.guild.seal.PackageSeal;

public abstract class RealmFactory {

public abstract Creature createCourier();
public abstract PackageSeal createSeal();
}
