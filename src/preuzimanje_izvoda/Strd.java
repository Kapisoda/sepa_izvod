package preuzimanje_izvoda;
import java.util.List;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
public class Strd {
	@XmlElementWrapper(name="CdtrRefInf")
	@XmlElement(name="Ref")
	private List <String> ref;
	
	@XmlElement(name="AddtlRmtInf")
	private String AddtlRmtInf;

	
	public String getAddtlRmtInf() {
		return AddtlRmtInf;
	}

	public void setAddtlRmtInf(String addtlRmtInf) {
		AddtlRmtInf = addtlRmtInf;
	}

	public List<String> getRef() {
		return ref;
	}

	public void setRef(List<String> ref) {
		this.ref = ref;
	}
	

	@Override
	   public String toString() {
	      return "" + ref +  System.lineSeparator()+AddtlRmtInf+  System.lineSeparator();
	   }
	
}
