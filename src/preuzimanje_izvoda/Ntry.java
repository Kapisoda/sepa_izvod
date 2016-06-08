package preuzimanje_izvoda;

import java.util.List;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
public class Ntry {

	@XmlElement(name="NtryRef")
	private String ntryRef;
	
	@XmlElement(name="Amt")
	private String amt;
	
	@XmlElement(name="CdtDbtInd")
	private String cdtDbtInd;
	
	@XmlElementWrapper(name="BookgDt")
	@XmlElement(name="DtTm")
	private List <String> dtTm;
	
	@XmlElementWrapper(name="ValDt")
	@XmlElement(name="Dt")
	private List <String> dt;
	
	@XmlElement(name="NtryDtls")
	private List <NtryDtls> ntryDtls;

	public String getNtryRef() {
		return ntryRef;
	}

	public void setNtryRef(String ntryRef) {
		this.ntryRef = ntryRef;
	}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getCdtDbtInd() {
		return cdtDbtInd;
	}

	public void setCdtDbtInd(String cdtDbtInd) {
		this.cdtDbtInd = cdtDbtInd;
	}

	public List<String> getDtTm() {
		return dtTm;
	}

	public void setDtTm(List<String> dtTm) {
		this.dtTm = dtTm;
	}

	public List<String> getDt() {
		return dt;
	}

	public void setDt(List<String> dt) {
		this.dt = dt;
	}

	public List<NtryDtls> getNtryDtls() {
		return ntryDtls;
	}

	public void setNtryDtls(List<NtryDtls> ntryDtls) {
		this.ntryDtls = ntryDtls;
	}
	
	
	@Override
	   public String toString() {
	      return "" + ntryRef +  System.lineSeparator() + amt +""+  System.lineSeparator()+cdtDbtInd
	    		  +  System.lineSeparator()+dtTm+  System.lineSeparator()+ dt+  System.lineSeparator()
	    		  +ntryDtls+System.lineSeparator();
	   }
	
}
