package Controller;
import model.LoanContainer;
import model.LPContainer;
import model.Copy;
//Actually CBT
public class LPController {
	
	private LPContainer lpc;
	
	public Copy findCopy(int serialNumber) {
		Copy res = null;
		for(int i = 0; i < lpc.getCurrentLPs().size(); i++) {
			for(int j = 0; j < lpc.searchLPCopies().size() ; j++) {
				if(serialNumber = lpc.searchLPCopies(j)) {
					res = lpc.searchLPCopies(j);
				}
			}
		}
		
	}
}
