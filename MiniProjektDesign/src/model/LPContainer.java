package model;
/**
 * @author Gruppe 6
 * @version 2022-11-09
 */
import java.util.ArrayList;

public class LPContainer {
	private static LPContainer instance;
	private ArrayList<LP> lps;
	private LP lp;
	private Copy copy;
	/**
	 * returns an instance of LPContainer <code>Person</code>
	 * 
	 * @param get instance of <code>LPContainer</code>
	 */
	public static LPContainer getInstance() {
		if(instance == null) {
			instance = new LPContainer();
		}
		return instance;
	}
	/**
	 * Constructs a new <code>LPContainer</code>
	 * 
	 * @param Construct new <code>LPContainer</code>
	 */
	private LPContainer() {
		lps = new ArrayList<>();
	}
	/**
	 * Adds an LP to the current <code>LPContainer</code>
	 * 
	 * @param Add new LP to <code>LPContainer</code>
	 */
	public void addLP(LP lp) {
		lps.add(lp);//TODO check correct input - null and duplicates
	}

	/**
	 * Returns a list of LP's in the <code>LPContainer</code>
	 * 
	 * @param get a list of every LP in <code>LPContainer</code>
	 */
	public ArrayList<LP> getCurrentLPs() {
		return lps;
	}
	
	/**
	 * Searches for a <code>Copy</code> with a matching serial number
	 * 
	 * @param Find a <code>Copy</code> with a matching serial Number
	 */
	public Copy searchLPCopies(int serialNumber) {
		Copy res = null;
		for (int i = 0; i < lps.size(); i++) {
			res = lps.get(i).getCopyBySN(serialNumber);
		}
		return res;
	}
}