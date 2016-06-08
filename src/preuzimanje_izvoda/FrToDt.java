package preuzimanje_izvoda;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)

public class FrToDt {

	@XmlElement(name="FrDtTm")
	private String FrDtTm;
	
	@XmlElement(name="ToDtTm")
	private String ToDtTm;

	public String getFrDtTm() {
		return FrDtTm;
	}

	public void setFrDtTm(String frDtTm) {
		FrDtTm = frDtTm;
	}

	public String getToDtTm() {
		return ToDtTm;
	}

	public void setToDtTm(String toDtTm) {
		ToDtTm = toDtTm;
	}
	
	@Override
	   public String toString() {
	      return "" + FrDtTm +  System.lineSeparator()+""+ToDtTm+System.lineSeparator();
	   }
	
}
