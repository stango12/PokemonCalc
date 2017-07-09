package data.elements;

import java.util.ArrayList;
import java.util.Arrays;

public class Ground implements Type
{

	@Override
	public ArrayList<TYPE> getWeaknesses() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.WATER, TYPE.ICE, TYPE.GRASS));
	}

	@Override
	public ArrayList<TYPE> getStrengths() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.FIRE, TYPE.ELECTRIC, TYPE.POISON, TYPE.ROCK, TYPE.STEEL));
	}

	@Override
	public ArrayList<TYPE> getNoEffectAtk() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.FLYING));
	}

	@Override
	public ArrayList<TYPE> getNoEffectDef() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.ELECTRIC));
	}

	@Override
	public ArrayList<TYPE> getDefHalfEffect() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.POISON, TYPE.ROCK));
	}

	@Override
	public ArrayList<TYPE> getAtkHalfEffect() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.GRASS, TYPE.BUG));
	}

}
