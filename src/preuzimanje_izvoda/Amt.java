package preuzimanje_izvoda;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)

public class Amt {
	
	@XmlAttribute(name="Ccy")
	private String ccy;
	
	@XmlValue
	private String kolicina;
	
	@Override
	   public String toString() {
	      return "valuta=" + ccy+  System.lineSeparator()+"kolicina=" + kolicina+  System.lineSeparator();
	   }

}
