package data.pokemon;

import java.util.ArrayList;
import java.util.Arrays;

import data.elements.*;

public class Clefable implements Pokemon
{
	Fairy t1 = new Fairy();
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Clefable";
	}

	@Override
	public ArrayList<TYPE> getType() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.FAIRY));
	}

	@Override
	public ArrayList<TYPE> getWeaknesses() {
		// TODO Auto-generated method stub
		return t1.getWeaknesses();
	}

	@Override
	public ArrayList<TYPE> getStrengths() {
		// TODO Auto-generated method stub
		return t1.getStrengths();
	}

	@Override
	public ArrayList<TYPE> getNoEffectAtk() {
		// TODO Auto-generated method stub
		return t1.getNoEffectAtk();
	}

	@Override
	public ArrayList<TYPE> getNoEffectDef() {
		// TODO Auto-generated method stub
		return t1.getNoEffectDef();
	}

	@Override
	public ArrayList<TYPE> getDefHalfEffect() {
		// TODO Auto-generated method stub
		return t1.getDefHalfEffect();
	}

	@Override
	public ArrayList<TYPE> getAtkHalfEffect() {
		// TODO Auto-generated method stub
		return t1.getAtkHalfEffect();
	}

}
