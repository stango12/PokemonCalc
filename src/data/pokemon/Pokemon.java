package data.pokemon;

import java.awt.Image;
import java.util.ArrayList;

import data.elements.Type;

public interface Pokemon extends Type
{
	String getName();
	ArrayList<TYPE> getType();
	ArrayList<TYPE> getWeaknesses();
	ArrayList<TYPE> getStrengths();
	ArrayList<TYPE> getNoEffectAtk();
	ArrayList<TYPE> getNoEffectDef();
	ArrayList<TYPE> getDefHalfEffect();
	ArrayList<TYPE> getAtkHalfEffect();
}
