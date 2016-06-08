package preuzimanje_izvoda;
import java.util.List;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
public class PstlAdr {
	@XmlElement(name="Ctry")
	private String ctry;

	@XmlElement(name="AdrLine")
	private List <String> adrLine;

	public String getCtry() {
		return ctry;
	}

	public void setCtry(String ctry) {
		this.ctry = ctry;
	}

	public List<String> getAdrLine() {
		return adrLine;
	}

	public void setAdrLine(List<String> adrLine) {
		this.adrLine = adrLine;
	}
	
	@Override
	   public String toString() {
	      return "" + ctry +  System.lineSeparator()+adrLine+System.lineSeparator();
	   }
	
}
