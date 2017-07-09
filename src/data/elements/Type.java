package data.elements;

import java.util.ArrayList;

public interface Type
{
	ArrayList<TYPE> getWeaknesses();
	ArrayList<TYPE> getStrengths();
	ArrayList<TYPE> getNoEffectAtk();
	ArrayList<TYPE> getNoEffectDef();
	ArrayList<TYPE> getDefHalfEffect();
	ArrayList<TYPE> getAtkHalfEffect();
	
	public enum TYPE {
		NORMAL,
		WATER,
		FIRE,
		GRASS,
		ELECTRIC,
		GROUND,
		ROCK,
		GHOST,
		PSYCHIC,
		DARK,
		FAIRY,
		FLYING,
		STEEL,
		ICE,
		DRAGON,
		POISON,
		FIGHTING,
		BUG
	}
}
