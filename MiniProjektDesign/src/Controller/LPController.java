package Controller;
import model.LoanContainer;
import model.LPContainer;
import model.Copy;
//Actually CBT
public class LPController {
	
	public Copy findCopy(int serialNumber) {
		Copy res = null;
		for(int i = 0; i < LPContainer.getCurrentLPs().size(); i++) {
			for(int j = 0; j < copies ; j++) {
				if(copies(j) = serialNumber) {
					res = copies(j);
				}
			}
		}
		
	}
}
