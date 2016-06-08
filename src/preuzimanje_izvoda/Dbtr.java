package preuzimanje_izvoda;

import java.util.List;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
public class Dbtr {
	@XmlElement(name="Nm")
	private String nm;
	
	@XmlElement(name="PstlAdr")
	private List <PstlAdr> pstlAdr;

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public List<PstlAdr> getPstlAdr() {
		return pstlAdr;
	}

	public void setPstlAdr(List<PstlAdr> pstlAdr) {
		this.pstlAdr = pstlAdr;
	}
	
	@Override
	   public String toString() {
	      return "" + nm +  System.lineSeparator()+pstlAdr+System.lineSeparator();
	   }

}
