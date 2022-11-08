package model;

import java.util.ArrayList;

public class LPContainer {
	private static LPContainer instance;
	private ArrayList<LP> lps;

	public static LPContainer getInstance() {
		if(instance == null) {
			instance = new LPContainer();
		}
		return instance;
	}
	private LPContainer() {
		lps = new ArrayList<>();
	}
	public void addLP(LP lp) {
		lps.add(lp);//TODO check correct input - null and duplicates
	}

	public ArrayList<LP> getCurrentLPs() {
		return lps;
	}
}
