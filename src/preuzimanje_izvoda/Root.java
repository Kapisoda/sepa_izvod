package preuzimanje_izvoda;
import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

@XmlRootElement(name = "Document")
public class Root {
	
	@XmlElement(name = "BkToCstmrStmt")
	List <BkToCstmrStmt> bkToCstmrStmt;

	public List<BkToCstmrStmt> getBkToCstmrStmt() {
		return bkToCstmrStmt;
	}

	public void setBkToCstmrStmt(List<BkToCstmrStmt> bkToCstmrStmt) {
		this.bkToCstmrStmt = bkToCstmrStmt;
	}
	
	
	@Override
	   public String toString() {
	      return "" + bkToCstmrStmt + "";
	   }
	

}
