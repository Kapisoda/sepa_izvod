package preuzimanje_izvoda;

import java.util.List;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)

public class Stmt {

	@XmlElement(name="Id")
	private String id;
	
	@XmlElement(name="CreDtTm")
	private String creDtTm;
	
	@XmlElement(name="FrToDt")
	private List <FrToDt> frToDt;
	
	@XmlElement(name="Bal")
	private List <Bal> bal;
	
	@XmlElement(name="TxsSummry")
	private List <TxsSummry> txsSummry;
	
	@XmlElement(name="Ntry")
	private List <Ntry> ntry;

	
	public List<Ntry> getNtry() {
		return ntry;
	}

	public void setNtry(List<Ntry> ntry) {
		this.ntry = ntry;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreDtTm() {
		return creDtTm;
	}

	public void setCreDtTm(String creDtTm) {
		this.creDtTm = creDtTm;
	}

	public List<FrToDt> getFrToDt() {
		return frToDt;
	}

	public void setFrToDt(List<FrToDt> frToDt) {
		this.frToDt = frToDt;
	}

	public List<Bal> getBal() {
		return bal;
	}

	public void setBal(List<Bal> bal) {
		this.bal = bal;
	}
	
	
	public List<TxsSummry> getTxsSummry() {
		return txsSummry;
	}

	public void setTxsSummry(List<TxsSummry> txsSummry) {
		this.txsSummry = txsSummry;
	}

	@Override
	   public String toString() {
	      return "" + id +  System.lineSeparator() + creDtTm +""+  System.lineSeparator()+frToDt
	    		  +  System.lineSeparator()+bal+  System.lineSeparator()+ txsSummry+  System.lineSeparator()
	    		  +ntry+System.lineSeparator();
	   }
	
}
