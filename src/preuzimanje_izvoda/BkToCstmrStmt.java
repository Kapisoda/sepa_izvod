package preuzimanje_izvoda;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)

public class BkToCstmrStmt {

	@XmlElement(name = "GrpHdr")
	private List <GrpHdr> grpHdr;
	
	@XmlElement(name = "Stmt")
	private List <Stmt> stmt;
	
	

	public List<Stmt> getStmt() {
		return stmt;
	}

	public void setStmt(List<Stmt> stmt) {
		this.stmt = stmt;
	}

	public List<GrpHdr> getGrpHdr() {
		return grpHdr;
	}

	public void setGrpHdr(List<GrpHdr> grpHdr) {
		this.grpHdr = grpHdr;
	}
	
	
	@Override
	   public String toString() {
	      return "" + grpHdr +  System.lineSeparator()+System.lineSeparator()+""+stmt;
	   }
	
}
