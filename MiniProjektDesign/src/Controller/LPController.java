package Controller;
import model.LoanContainer;
import model.LPContainer;

import java.util.ArrayList;

import model.Copy;
import model.LP;
//Actually CBT
public class LPController {
	
	
	public Copy findCopy(int serialNumber) {
		LPContainer lpc = LPContainer.getInstance();
		ArrayList<LP> lps = lpc.getCurrentLPs();
		Copy res = null;
		for (int i = 0; i < lps.size(); i++) {
			lps.get(i).searchLPCopies(serialNumber);
		}
		return res;
	}
}