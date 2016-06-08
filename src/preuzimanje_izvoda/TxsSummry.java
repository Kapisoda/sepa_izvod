package preuzimanje_izvoda;

import java.util.List;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)


public class TxsSummry {
	
	@XmlElement(name="TtlCdtNtries")
	private List<TtlCdtNtries> ttlCdtNtries;
	
	@XmlElement(name="TtlDbtNtries")
	private List<TtlDbtNtries> ttlDbtNtries;

	
	public List<TtlDbtNtries> getTtlDbtNtries() {
		return ttlDbtNtries;
	}

	public void setTtlDbtNtries(List<TtlDbtNtries> ttlDbtNtries) {
		this.ttlDbtNtries = ttlDbtNtries;
	}

	public List<TtlCdtNtries> getTtlCdtNtries() {
		return ttlCdtNtries;
	}

	public void setTtlCdtNtries(List<TtlCdtNtries> ttlCdtNtries) {
		this.ttlCdtNtries = ttlCdtNtries;
	}

	@Override
	   public String toString() {
	      return "potrazni=" + ttlCdtNtries +  System.lineSeparator()+ "dugovni="+ttlDbtNtries+  System.lineSeparator() ;
	   }
}
