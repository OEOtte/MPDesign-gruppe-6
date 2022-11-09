package model;

import java.util.ArrayList;

public class LPContainer {
	private static LPContainer instance;
	private ArrayList<LP> lps;
	private LP lp;
	private Copy copy;

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
	

	public Copy searchLPCopies(int serialNumber) {
		ArrayList<Copy> copies = new ArrayList<>(lp.getCopies());
		Copy copy = null;
		for (int i = 0; i < copies.size(); i++) {
			if(copies.get(i).getSerialNumber() == serialNumber) {
				copy = copies.get(i);
			}
		}
		return copy;
	}
	
	public int checkCopySerial() {
		int res = 0;
		
		res = copy.getSerialNumber();
		
		return res;
	}
	
}
