package data.elements;

import java.util.ArrayList;
import java.util.Arrays;

public class Rock implements Type
{

	@Override
	public ArrayList<TYPE> getWeaknesses() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.WATER, TYPE.GRASS, TYPE.GROUND, TYPE.FIGHTING, TYPE.STEEL));
	}

	@Override
	public ArrayList<TYPE> getStrengths() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.FLYING, TYPE.FIRE, TYPE.ICE, TYPE.BUG));
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
		return new ArrayList<TYPE>(Arrays.asList(TYPE.NORMAL, TYPE.FIRE, TYPE.POISON, TYPE.FLYING));
	}

	@Override
	public ArrayList<TYPE> getAtkHalfEffect() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.FIGHTING, TYPE.GROUND, TYPE.STEEL));
	}

}
