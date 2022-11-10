package Controller;
/**
 * @author Gruppe 6
 * @version 2022-11-09
 */
import model.LoanContainer;
import model.LPContainer;

import java.util.ArrayList;

import model.Copy;
import model.LP;

public class LPController {
	
	
	public Copy findCopy(int serialNumber) {
		LPContainer lpc = LPContainer.getInstance();
		Copy res = null;
		res = lpc.searchLPCopies(serialNumber);
		return res;
	}
}