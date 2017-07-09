package data.elements;

import java.util.ArrayList;
import java.util.Arrays;

public class Electric implements Type
{

	@Override
	public ArrayList<TYPE> getWeaknesses() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.GROUND));
	}

	@Override
	public ArrayList<TYPE> getStrengths() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.WATER, TYPE.FLYING));
	}

	@Override
	public ArrayList<TYPE> getNoEffectAtk() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.GROUND));
	}

	@Override
	public ArrayList<TYPE> getDefHalfEffect() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.ELECTRIC, TYPE.FLYING, TYPE.STEEL));
	}

	@Override
	public ArrayList<TYPE> getAtkHalfEffect() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.ELECTRIC, TYPE.GRASS, TYPE.DRAGON));
	}

	@Override
	public ArrayList<TYPE> getNoEffectDef() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>();
	}

}
