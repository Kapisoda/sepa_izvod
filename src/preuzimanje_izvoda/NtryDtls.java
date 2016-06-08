package preuzimanje_izvoda;
import java.util.List;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
public class NtryDtls {
	@XmlElement(name="TxDtls")
	private List <TxDtls> txDtls;

	public List<TxDtls> getTxDtls() {
		return txDtls;
	}

	public void setTxDtls(List<TxDtls> txDtls) {
		this.txDtls = txDtls;
	}
	

	@Override
	   public String toString() {
	      return "" + txDtls +  System.lineSeparator();
	   }
	
}
