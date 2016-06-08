package preuzimanje_izvoda;
import java.util.List;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
public class RmtInf {

	@XmlElement(name="Strd")
	private List <Strd> strd;

	public List<Strd> getStrd() {
		return strd;
	}

	public void setStrd(List<Strd> strd) {
		this.strd = strd;
	}
	@Override
	   public String toString() {
	      return "" + strd +  System.lineSeparator();
	   }
	
}
