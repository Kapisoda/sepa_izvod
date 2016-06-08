package preuzimanje_izvoda;
import java.util.List;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
public class TxDtls {
	@XmlElementWrapper(name="Refs")
	@XmlElement(name="EndToEndId")
	private List <String> endToEndId;
	
	@XmlElement(name="RltdPties")
	private List <RltdPties> rltdPties;
	
	@XmlElement(name="RmtInf")
	private List <RmtInf> rmtInf;
	
	

	public List<RmtInf> getRmtInf() {
		return rmtInf;
	}

	public void setRmtInf(List<RmtInf> rmtInf) {
		this.rmtInf = rmtInf;
	}

	public List<RltdPties> getRltdPties() {
		return rltdPties;
	}

	public void setRltdPties(List<RltdPties> rltdPties) {
		this.rltdPties = rltdPties;
	}

	public List<String> getEndToEndId() {
		return endToEndId;
	}

	public void setEndToEndId(List<String> endToEndId) {
		this.endToEndId = endToEndId;
	}
	
	@Override
	   public String toString() {
	      return "ENDTOEND=" + endToEndId +  System.lineSeparator()+rltdPties+  System.lineSeparator()
	      +rmtInf+  System.lineSeparator();
	   }

}
