package data.elements;

import java.util.ArrayList;
import java.util.Arrays;

public class Ice implements Type
{

	@Override
	public ArrayList<TYPE> getWeaknesses() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.FIRE, TYPE.STEEL, TYPE.FIGHTING, TYPE.ROCK));
	}

	@Override
	public ArrayList<TYPE> getStrengths() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.DRAGON, TYPE.FLYING, TYPE.GRASS, TYPE.GROUND));
	}

	@Override
	public ArrayList<TYPE> getNoEffectAtk() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>();
	}

	@Override
	public ArrayList<TYPE> getNoEffectDef() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>();
	}

	@Override
	public ArrayList<TYPE> getDefHalfEffect() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.ICE));
	}

	@Override
	public ArrayList<TYPE> getAtkHalfEffect() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.FIRE, TYPE.WATER, TYPE.ICE, TYPE.STEEL));
	}

}
