package preuzimanje_izvoda;
import java.util.List;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
public class RltdPties {
	
	@XmlElement(name="Dbtr")
	private List <Dbtr> dbtr;
	
	@XmlElement(name="DbtrAcct")
	private List <DbtrAcct> dbtrAcct;

	public List<Dbtr> getDbtr() {
		return dbtr;
	}

	public void setDbtr(List<Dbtr> dbtr) {
		this.dbtr = dbtr;
	}
	
	public List<DbtrAcct> getDbtrAcct() {
		return dbtrAcct;
	}

	public void setDbtrAcct(List<DbtrAcct> dbtrAcct) {
		this.dbtrAcct = dbtrAcct;
	}

	@Override
	   public String toString() {
	      return "" + dbtr +  System.lineSeparator()+dbtrAcct+System.lineSeparator();
	   }

}
