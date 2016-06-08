package preuzimanje_izvoda;
import java.util.List;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
public class DbtrAcct {
	@XmlElementWrapper(name="Id")
	@XmlElement(name="IBAN")
	private List <String> iBAN;

	public List<String> getiBAN() {
		return iBAN;
	}

	public void setiBAN(List<String> iBAN) {
		this.iBAN = iBAN;
	}
	
	@Override
	   public String toString() {
	      return "" + iBAN +  System.lineSeparator();
	   }

}
