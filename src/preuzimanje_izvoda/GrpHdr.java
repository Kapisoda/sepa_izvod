package preuzimanje_izvoda;

import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)

public class GrpHdr {
	
	@XmlElement(name ="MsgId")
	private String msgId;
	
	@XmlElement(name ="CreDtTm")
	private String creDtTm;

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getCreDtTm() {
		return creDtTm;
	}

	public void setCreDtTm(String creDtTm) {
		this.creDtTm = creDtTm;
	}
	
	
	@Override
	   public String toString() {
	      return "" + msgId +  System.lineSeparator()+  System.lineSeparator() + creDtTm +"";
	   }
	

}
