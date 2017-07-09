package data.elements;

import java.util.ArrayList;
import java.util.Arrays;

public class Steel implements Type
{

	@Override
	public ArrayList<TYPE> getWeaknesses() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.FIGHTING, TYPE.FIRE, TYPE.GROUND));
	}

	@Override
	public ArrayList<TYPE> getStrengths() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.ICE, TYPE.ROCK, TYPE.FAIRY));
	}

	@Override
	public ArrayList<TYPE> getNoEffectAtk() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>();
	}

	@Override
	public ArrayList<TYPE> getNoEffectDef() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.POISON));
	}

	@Override
	public ArrayList<TYPE> getDefHalfEffect() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.NORMAL, TYPE.GRASS, TYPE.ICE, TYPE.FLYING, TYPE.PSYCHIC, TYPE.BUG, TYPE.ROCK, TYPE.DRAGON, TYPE.STEEL, TYPE.FAIRY));
	}

	@Override
	public ArrayList<TYPE> getAtkHalfEffect() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.FIRE, TYPE.WATER, TYPE.ELECTRIC, TYPE.STEEL));
	}

}
