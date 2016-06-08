package preuzimanje_izvoda;

import java.util.List;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)

public class Tp {

	@XmlElementWrapper(name="CdOrPrtry")
	@XmlElement(name="Cd")
	private List <String> cd;
	
	public List<String> getCd() {
		return cd;
	}

	public void setCd(List<String> cd) {
		this.cd = cd;
	}

	@Override
	   public String toString() {
	      return "" + cd+  System.lineSeparator();
	   }
}
