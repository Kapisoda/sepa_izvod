package preuzimanje_izvoda;
import java.util.List;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
public class Bal {
	@XmlElement(name="Tp")
	private List <Tp> tp;
	
	@XmlElement(name="Amt")
	private List <Amt> amt;
	
	@XmlElement(name="CdtDbtInd")
	private String cdtDbtInd;

	
	public String getCdtDbtInd() {
		return cdtDbtInd;
	}

	public void setCdtDbtInd(String cdtDbtInd) {
		this.cdtDbtInd = cdtDbtInd;
	}

	public List<Tp> getTp() {
		return tp;
	}

	public void setTp(List<Tp> tp) {
		this.tp = tp;
	}
	
	

	public List<Amt> getAmt() {
		return amt;
	}

	public void setAmt(List<Amt> amt) {
		this.amt = amt;
	}

	@Override
	   public String toString() {
	      return "" + tp+  System.lineSeparator()+amt+System.lineSeparator()+cdtDbtInd+System.lineSeparator();
	   }
}
