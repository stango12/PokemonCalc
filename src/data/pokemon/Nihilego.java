package data.pokemon;

import java.util.ArrayList;
import java.util.Arrays;

import data.elements.*;

public class Nihilego implements Pokemon
{
	Poison t1 = new Poison();
	Rock t2 = new Rock();
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Nihilego";
	}

	@Override
	public ArrayList<TYPE> getType() {
		// TODO Auto-generated method stub
		return new ArrayList<TYPE>(Arrays.asList(TYPE.POISON, TYPE.ROCK));
	}

	@Override
	public ArrayList<TYPE> getWeaknesses() {
		ArrayList<TYPE> weakness = new ArrayList<TYPE>();
		for(int i = 0; i < t1.getWeaknesses().size(); i++)
		{
			if(!t2.getDefHalfEffect().contains(t1.getWeaknesses().get(i)) && !t2.getNoEffectDef().contains(t1.getWeaknesses().get(i)))
			{
				weakness.add(t1.getWeaknesses().get(i));
			}
		}
		for(int i = 0; i < t2.getWeaknesses().size(); i++)
		{
			if(!t1.getDefHalfEffect().contains(t2.getWeaknesses().get(i)) && !t1.getNoEffectDef().contains(t2.getWeaknesses().get(i)))
			{
				weakness.add(t2.getWeaknesses().get(i));
			}
		}
		return weakness;
	}

	@Override
	public ArrayList<TYPE> getStrengths() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<TYPE> getNoEffectAtk() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<TYPE> getNoEffectDef() {
		// TODO Auto-generated method stub
		ArrayList<TYPE> noEffDef = new ArrayList<TYPE>(t1.getNoEffectDef());
		noEffDef.addAll(t2.getNoEffectDef());
		return noEffDef;
	}

	@Override
	public ArrayList<TYPE> getDefHalfEffect() {
		// TODO Auto-generated method stub
		ArrayList<TYPE> weakness = new ArrayList<TYPE>();
		for(int i = 0; i < t1.getDefHalfEffect().size(); i++)
		{
			if(!t2.getWeaknesses().contains(t1.getDefHalfEffect().get(i)) && !t2.getNoEffectDef().contains(t1.getDefHalfEffect().get(i)))
			{
				weakness.add(t1.getDefHalfEffect().get(i));
			}
		}
		for(int i = 0; i < t2.getDefHalfEffect().size(); i++)
		{
			if(!t1.getWeaknesses().contains(t2.getDefHalfEffect().get(i)) && !t1.getNoEffectDef().contains(t2.getDefHalfEffect().get(i)))
			{
				weakness.add(t2.getDefHalfEffect().get(i));
			}
		}
		return weakness;
	}

	@Override
	public ArrayList<TYPE> getAtkHalfEffect() {
		// TODO Auto-generated method stub
		return null;
	}

}
