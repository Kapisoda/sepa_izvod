package preuzimanje_izvoda;



import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)

public class TtlCdtNtries {

	@XmlElement(name="Sum")
	private String sum;

	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}
	
	@Override
	   public String toString() {
	      return "suma=" + sum +  System.lineSeparator() ;
	   }
	
}
